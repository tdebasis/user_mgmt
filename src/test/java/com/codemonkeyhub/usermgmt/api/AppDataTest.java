package com.codemonkeyhub.usermgmt.api;

import static io.dropwizard.testing.FixtureHelpers.*;
import static org.assertj.core.api.Assertions.assertThat ;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;
import org.junit.Test;

/**
 * Created by tsinha on 4/28/16.
 */
public class AppDataTest {

    private static final ObjectMapper mapper = Jackson.newObjectMapper() ;
    @Test
    public void serializeToJson () throws Exception {

        final AppData appData = new AppData(1, "Testing") ;
        final String expected = mapper.writeValueAsString(
                mapper.readValue(fixture("fixtures/AppData.json"), AppData.class));

        assertThat (mapper.writeValueAsString(appData)).isEqualTo(expected);
    }
}
