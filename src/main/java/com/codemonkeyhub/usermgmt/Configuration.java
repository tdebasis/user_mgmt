package com.codemonkeyhub.usermgmt;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by tsinha on 4/28/16.
 */
public class Configuration extends io.dropwizard.Configuration{

    @NotEmpty
    private String template ;

    @JsonProperty
    public String getTemplate() {
        return template;
    }

    @JsonProperty
    public void setTemplate(String template) {
        this.template = template;
    }
}
