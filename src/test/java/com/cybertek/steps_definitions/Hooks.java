package com.cybertek.steps_definitions;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUpScenario() {
        System.out.println("My before method is working");
        //Driver.getDriver().get(ConfigurationReader.getProperty("etsyUrl"));
    }

    @After
    public void tearDownScenario() {
        BrowserUtils.screenShot();

    }
}
