package com.cybertek.steps_definitions;

import com.cybertek.pages.EtsySearchFunctionality;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class EtsyTitleVerification {

    EtsySearchFunctionality etsySearchFunctionality = new EtsySearchFunctionality();

    @Given("user is on Etsy homepage")
    public void userIsOnEtsyHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsyUrl"));
    }

    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    @When("user types Wooden Spoon in the search box and click")
    public void userTypesWoodenSpoonInTheSearchBoxAndClick() {
        etsySearchFunctionality.searchBox.click();
       etsySearchFunctionality.searchBox.sendKeys("Wooden Spoon" + Keys.ENTER);

    }

    @Then("user should see Wooden Spoon is in the title")
    public void userShouldSeeWoodenSpoonIsInTheTitle() {

        String expectedTitle = "Wooden spoon";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }


    @When("user types {string} in the search box and click")
    public void userTypesInTheSearchBoxAndClick(String arg0) {

        etsySearchFunctionality.searchBox.click();
        etsySearchFunctionality.searchBox.sendKeys(arg0 + Keys.ENTER);

    }

    @Then("user should see {string} is in the title")
    public void userShouldSeeIsInTheTitle(String arg0) {

        String expectedTitle = arg0;
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(expectedTitle);

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
}
