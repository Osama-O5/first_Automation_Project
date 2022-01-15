package com.code95.Functional;

import PageObjects.Homepage;
import PageObjects.Loginpage;
import Utils.PropertiesReader;
import Utils.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    SoftAssert softAssert ;
    PropertiesReader propertiesReader;
    Loginpage loginpage;
    Homepage homepage;

    @BeforeSuite
    public void beforeclass() {
//        WebDriverManager.chromedriver().setup();
        WebDriverSingleton.getInstance().getDriver().navigate().to(propertiesReader.getUrl());
        propertiesReader = new PropertiesReader();
         loginpage = new Loginpage(WebDriverSingleton.getInstance().getDriver());
         homepage = new Homepage(WebDriverSingleton.getInstance().getDriver());
    }
    @AfterSuite
    public void afterclass(){
        driver.quit();
    }
}
