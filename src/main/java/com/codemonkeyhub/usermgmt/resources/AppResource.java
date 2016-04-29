package com.codemonkeyhub.usermgmt.resources;

import com.codahale.metrics.annotation.Timed;
import com.codemonkeyhub.usermgmt.api.AppData;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by tsinha on 4/28/16.
 */
@Path("/app-resource")
@Produces (MediaType.APPLICATION_JSON)
public class AppResource {

    private String templateName ;


    public AppResource(String templateName) {
        this.templateName = templateName ;
    }

    @Timed
    @GET
    @Path("/meta-data")
    public AppData getMetaData () {
        return new AppData(1, templateName) ;
    }

}
