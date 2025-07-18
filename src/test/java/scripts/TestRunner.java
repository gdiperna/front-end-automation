package scripts;


import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.SelectFile;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
//@SelectClasspathResource("features")
@SelectFile("src/test/resources/features/openbank_navigation.feature")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "scripts")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/cucumber-report.html")
public class TestRunner {
}






