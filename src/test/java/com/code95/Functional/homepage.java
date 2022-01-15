package com.code95.Functional;

import Utils.ObejRepo;
import Utils.WebDriverSingleton;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class homepage extends BaseTest {

    @Test
    public void navigateToLogin() {
        wait = new WebDriverWait(WebDriverSingleton.getInstance().getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(ObejRepo.signinID));

//        com.code95.Functional.homepage.clickOnSignIn();

    }
}
