package com.codemonkeyhub.usermgmt;

import com.codemonkeyhub.usermgmt.health.AppMetaHealthCheck;
import com.codemonkeyhub.usermgmt.resources.AppResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by tsinha on 4/28/16.
 */
public class App extends Application<Configuration> {


    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public String getName() {
        return "codemonkeyhub-user-mgmt";
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {

    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {

        final AppResource resource = new AppResource(configuration.getTemplate()) ;
        final AppMetaHealthCheck metaHealthCheck = new AppMetaHealthCheck(configuration);

        environment.jersey().register(resource);
        environment.healthChecks().register("meta",metaHealthCheck);
    }
}
