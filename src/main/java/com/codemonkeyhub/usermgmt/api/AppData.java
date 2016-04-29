package com.codemonkeyhub.usermgmt.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * Created by tsinha on 4/28/16.
 */
public class AppData {

    private long id ;

    @Length (max = 25)
    private String appName ;

    public AppData(){}

    public AppData(long id, String appName) {
        this.id = id ;
        this.appName = appName ;
    }

    @JsonProperty
    public long getId () {
        return id ;
    }

    @JsonProperty
    public String getAppName () {
        return appName ;
    }
}
