package com.code95.Functional;

import Utils.ObejRepo;
import Utils.WebDriverSingleton;
import com.code95.Functional.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class login extends BaseTest {

// login
    @Test(priority = 1)
    public void LoginSuccess() {
        softAssert = new SoftAssert();

        loginpage.waitEmail();

        loginpage.enterEmail();

        loginpage.enterPass();

        loginpage.clickOnSubmit();

        wait.until(ExpectedConditions.visibilityOfElementLocated(ObejRepo.headerID));
        WebElement header = WebDriverSingleton.getInstance().getDriver().findElement(ObejRepo.headerID);
        String actualResult = header.getText();
        String expectedResult = "MY ACCOUNT";
        softAssert.assertEquals(actualResult, expectedResult);

        softAssert.assertAll();
    }


    @Test(priority = 2)
    public void loginInValidEmail() {
        softAssert = new SoftAssert();

        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ObejRepo.emailID));


        loginpage.enterInvalidEmail();

        WebElement submit = driver.findElement(ObejRepo.submitID);
        submit.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(ObejRepo.errorMsg));
        WebElement errorMsg = driver.findElement(ObejRepo.errorMsg);
        String actualResult = errorMsg.getText();
        String expectedResult = "There is 1 error\n" +
                "Invalid email address.";
        softAssert.assertEquals(actualResult, expectedResult);
        driver.navigate().back();
        softAssert.assertAll();

    }
}

//
//    @Test(priority = 2)
//    public void loginInValidpass(){
//        softAssert = new SoftAssert();
//
//        wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(ObejRepo.emailID));
//
//        WebElement emailField = driver.findElement(ObejRepo.emailID);
//        emailField.clear();
//
//        WebElement passField = driver.findElement(ObejRepo.passID);
//        passField.sendKeys(invalidpass);
//
//        WebElement submit = driver.findElement(ObejRepo.submitID);
//        submit.click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(ObejRepo.errorMsg));
//        WebElement errorMsg = driver.findElement(ObejRepo.errorMsg);
//        String actualResult2 = errorMsg.getText();
//        String expectedResult2 = "There is 1 error\n" +
//                "An password required.";
//        softAssert.assertEquals(actualResult2,expectedResult2);
//
//        driver.navigate().back();
//        softAssert.assertAll();
//    }
//
//    @Test(priority = 3)
//    public void loginWithOutData(){
//        softAssert = new SoftAssert();
//
//        wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(ObejRepo.emailID));
//
//        WebElement passField = driver.findElement(ObejRepo.passID);
//        passField.clear();
//
//        WebElement submit = driver.findElement(ObejRepo.submitID);
//        submit.click();
//
//        wait.until(ExpectedConditions.visibilityOfElementLocated(ObejRepo.errorMsg));
//        WebElement errorMsg = driver.findElement(ObejRepo.errorMsg);
//        String actualResult = errorMsg.getText();
//        String expectedResult = "There is 2 error\n" +
//                "An email address and password required.";
//        softAssert.assertEquals(actualResult,expectedResult);
//
//        driver.navigate().back();
//
//        softAssert.assertAll();
//    }