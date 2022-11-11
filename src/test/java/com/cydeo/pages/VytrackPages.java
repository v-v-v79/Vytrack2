package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;
import java.util.*;

public class VytrackPages {

    public VytrackPages() throws MalformedURLException {
        PageFactory.initElements(Driver.getDriverPool(), this);
    }
    @FindBy(xpath = "//input[@id='prependedInput']")
    public WebElement userNameInput;

    @FindBy(xpath = "//input[@id='prependedInput2']")
    public WebElement passWordInput;

    @FindBy(xpath = "//button[@data-dismiss='alert']")
    public WebElement alertCloseButton;

    @FindBy(xpath = "//a//span[text()[normalize-space()='Dashboards']]")
    public WebElement dashBoardsModule;

    @FindBy(xpath = "//a//span[text()[normalize-space()='Fleet']]")
    public WebElement fleetModule;

    @FindBy(xpath = "//a//span[text()[normalize-space()='Customers']]")
    public WebElement customersModule;

    @FindBy(xpath = "//a//span[text()[normalize-space()='Sales']]")
    public WebElement salesModule;

    @FindBy(xpath = "//a//span[text()[normalize-space()='Activities']]")
    public WebElement activitiesModule;

    @FindBy(xpath = "//a//span[text()[normalize-space()='Marketing']]")
    public WebElement marketingModule;

    @FindBy(xpath = "//a//span[text()[normalize-space()='Reports & Segments']]")
    public WebElement reportsAndSegmentsModule;

    @FindBy(xpath = "//a//span[text()[normalize-space()='System']]")
    public WebElement systemModule;

    @FindBy(id = "user-menu")
    public WebElement userButton;

    @FindBy(xpath = "//a[@href='/user/logout']")
    public WebElement logoutButton;

    public void managerModuleListCheck() throws MalformedURLException {
        List<String> expectedRes = new ArrayList<>(Arrays.asList("Dashboards", "Fleet", "Customers", "Sales",
                "Activities", "Marketing", "Reports & Segments", "System"));
        List<String> managerModules = new ArrayList<>();
        Driver.waitUntilVisible(dashBoardsModule, 10);
        managerModules.add(dashBoardsModule.getText());
        managerModules.add(fleetModule.getText());
        managerModules.add(customersModule.getText());
        managerModules.add(salesModule.getText());
        managerModules.add(activitiesModule.getText());
        managerModules.add(marketingModule.getText());
        managerModules.add(reportsAndSegmentsModule.getText());
        managerModules.add(systemModule.getText());
        int i = 0;
        for (String managerModule : managerModules) {
            Assert.assertEquals("(Manager)Test is FAILED", expectedRes.get(i),managerModule);
            i++;
        }
    }

    public void driverModuleListCheck() throws MalformedURLException {
        List<String> expectedRes = new ArrayList<>(Arrays.asList("Fleet", "Customers", "Activities", "System"));
        List<String> driverModules = new ArrayList<>();
        Driver.waitUntilVisible(fleetModule, 10);
        driverModules.add(fleetModule.getText());
        driverModules.add(customersModule.getText());
        driverModules.add(activitiesModule.getText());
        driverModules.add(systemModule.getText());
        int i = 0;
        for (String driverModule : driverModules) {
            Assert.assertEquals("(Driver)Test is FAILED", expectedRes.get(i),driverModule);
            i++;
        }
    }

    public void logout() throws MalformedURLException {
        Actions actions = new Actions(Driver.getDriverPool());
        actions.moveToElement(userButton);
        actions.click();
        actions.moveToElement(logoutButton);
        actions.click();
        Driver.closeDriver();
    }
}
