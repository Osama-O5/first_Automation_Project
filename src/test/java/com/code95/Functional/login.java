package com.code95.Functional;

import PageObjects.Loginpage;
import Utils.ObejRepo;
import Utils.WebDriverSingleton;
import com.code95.Functional.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class login extends BaseTest {

    @Test
    public void LoginSuccess() {
        softAssert = new SoftAssert();
        loginpage.enterEmail();
        loginpage.enterPass();
        loginpage.clickOnSubmit();
        softAssert.assertEquals(loginpage.getcurrentHeaderText(), loginpage.expectHeaderText());
        softAssert.assertAll();
    }
}