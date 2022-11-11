package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class BrowserUtils {
    public static void sleep(int seconds){
         try {
             Thread.sleep(seconds* 1000L);
         }catch(InterruptedException e){
             e.printStackTrace();
             System.out.println("Exception happened in sleep method!");
         }
     }

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
}
