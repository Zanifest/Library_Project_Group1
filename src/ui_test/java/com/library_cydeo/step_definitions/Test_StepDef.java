package com.library_cydeo.step_definitions;

import com.library_cydeo.pages.BasePage;
import com.library_cydeo.utilities.ConfigurationReader;
import com.library_cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Test_StepDef {

    BasePage basePage = new BasePage();
    @Given("user on login page")
    public void user_on_login_page() {
        Driver.getDriverPool().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters credentials")
    public void user_enters_credentials() {
        basePage.emailInputBox.sendKeys(ConfigurationReader.getProperty("user_librarian1"));
        basePage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password_librarian1"));
    }
    @When("user clicks sign in button")
    public void user_clicks_sign_in_button() {
        basePage.signInButton.click();
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        Assert.assertTrue(Driver.getDriverPool().getTitle().contains("Library"));
    }

}
