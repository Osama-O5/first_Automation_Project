package PageObjects;

import Utils.ObejRepo;
import Utils.PropertiesReader;
import Utils.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage {
    WebDriver driver;
    PropertiesReader propertiesReader;
    WebDriverWait wait;

    public Loginpage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);

}

    public void enterEmail() {
        propertiesReader = new PropertiesReader();
        wait.until(ExpectedConditions.visibilityOfElementLocated(ObejRepo.emailID));
        WebElement emailField =WebDriverSingleton.getInstance().getDriver().findElement(ObejRepo.emailID);
        emailField.sendKeys(propertiesReader.getEmail());
    }

    public void enterPass() {
        propertiesReader = new PropertiesReader();
        WebElement passField = WebDriverSingleton.getInstance().getDriver().findElement(ObejRepo.passID);
        passField.sendKeys(propertiesReader.getPass());
    }

    public void clickOnSubmit() {
        WebElement submit = WebDriverSingleton.getInstance().getDriver().findElement(ObejRepo.submitID);
        submit.click();
    }

    public String getcurrentHeaderText() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ObejRepo.headerID));
        WebElement header = WebDriverSingleton.getInstance().getDriver().findElement(ObejRepo.headerID);
        return header.getText();
    }


    public String expectHeaderText() {
        String expectedResult = "MY ACCOUNT";

        return expectedResult;
    }
}
