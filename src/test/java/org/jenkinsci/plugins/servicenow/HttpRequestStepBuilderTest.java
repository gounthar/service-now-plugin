package org.jenkinsci.plugins.servicenow;

import org.jenkinsci.plugins.servicenow.model.ServiceNowConfiguration;
import org.junit.Test;

public class HttpRequestStepBuilderTest {

    @Test
    public void setsQueryParametersTest() {
        ServiceNowStep step = new ServiceNowStep(new ServiceNowConfiguration("test"), "table_name");
    }
}
