package scripts;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import pages.OpenBankHomePage;
import utilities.DriverConfiguration;

public class Hooks {

    public static OpenBankHomePage controllerO;

    @Before
    public void setUp() {
        DriverConfiguration.getDriver();
        controllerO = new OpenBankHomePage();
    }

    @After
    public void tearDown() {
        DriverConfiguration.quitDriver();
        controllerO =null;
    }
}
