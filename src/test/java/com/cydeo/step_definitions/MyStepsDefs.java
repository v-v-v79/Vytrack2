package com.cydeo.step_definitions;

import com.cydeo.pages.VytrackPages;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

import java.net.MalformedURLException;

public class MyStepsDefs {
    VytrackPages vytrackPages = new VytrackPages();

    public MyStepsDefs() throws MalformedURLException {
    }

    @Given("Manager is on login page")
    public void manager_is_on_login_page() throws MalformedURLException {
        Driver.getDriverPool().get(ConfigurationReader.getProperty("env"));
        Driver.waitUntilVisible(vytrackPages.userNameInput, 10);
    }

    @When("Manager enters {string} into Username box and pushes Enter")
    public void manager_enters_into_username_box(String userName) throws MalformedURLException {
        Driver.waitUntilVisible(vytrackPages.userNameInput, 10);
        vytrackPages.userNameInput.sendKeys(userName + Keys.ENTER);
    }

    @When("Manager enters {string} into Password box and pushes Enter")
    public void manager_enters_password_into_password_box(String password) throws MalformedURLException {
        Driver.waitUntilVisible(vytrackPages.passWordInput, 10);
        vytrackPages.passWordInput.sendKeys(password + Keys.ENTER);
    }
    @Then("Manager see home page with eight modules")
    public void manager_see_home_page_with_eight_modules() throws MalformedURLException {
        vytrackPages.managerModuleListCheck();
    }

    @And("Manager logs out")
    public void managerLogsOut() throws MalformedURLException {
        vytrackPages.logout();
    }

    @Given("Driver is on login page")
    public void driver_is_on_login_page() throws MalformedURLException {
        Driver.getDriverPool().get(ConfigurationReader.getProperty("env"));
        Driver.waitUntilVisible(vytrackPages.userNameInput, 10);
    }

    @When("Driver enters {string} into Username box and pushes Enter")
    public void driver_enters_user19_into_username_box_and_pushes_enter(String userName)
            throws MalformedURLException {
        Driver.waitUntilClickable(vytrackPages.userNameInput, 10);
        vytrackPages.userNameInput.sendKeys(userName + Keys.ENTER);
    }

    @When("Driver enters {string} into Password box")
    public void driver_enters_into_password_box(String password) throws MalformedURLException {
        Driver.waitUntilClickable(vytrackPages.passWordInput, 10);
        vytrackPages.passWordInput.sendKeys(password + Keys.ENTER);
    }

    @Then("Driver see home page with four modules")
    public void driver_see_home_page_with_four_modules() throws MalformedURLException {
        vytrackPages.driverModuleListCheck();
    }

    @And("Driver logs out")
    public void driverLogsOut() throws MalformedURLException {
        vytrackPages.logout();
    }
}
