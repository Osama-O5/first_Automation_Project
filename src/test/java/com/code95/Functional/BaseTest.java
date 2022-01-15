package com.code95.Functional;

import PageObjects.Homepage;
import PageObjects.Loginpage;
import Utils.PropertiesReader;
import Utils.WebDriverSingleton;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    WebDriverWait wait;
    SoftAssert softAssert;
    PropertiesReader propertiesReader;
    Loginpage loginpage;
    Homepage homepage;

    @BeforeClass
    public void beforeclass() {
        propertiesReader = new PropertiesReader();
        homepage = new Homepage(WebDriverSingleton.getInstance().getDriver());
        loginpage = new Loginpage(WebDriverSingleton.getInstance().getDriver());
    }

    @AfterSuite
    public void afterclass() {
        WebDriverSingleton.getInstance().getDriver().quit();
    }
}
