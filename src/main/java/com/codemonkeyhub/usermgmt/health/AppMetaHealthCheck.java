package com.codemonkeyhub.usermgmt.health;

import com.codahale.metrics.health.HealthCheck;
import com.codemonkeyhub.usermgmt.Configuration;

/**
 * Created by tsinha on 4/28/16.
 */
public class AppMetaHealthCheck extends HealthCheck{

    private Configuration configuration ;

    public AppMetaHealthCheck (Configuration configuration){
        this.configuration = configuration ;
    }

    @Override
    protected Result check() throws Exception {
        if (configuration.getTemplate() == null || configuration.getTemplate().length() < 5){
            return Result.unhealthy("Template is not correctly configured") ;
        }
        return Result.healthy() ;
    }
}
