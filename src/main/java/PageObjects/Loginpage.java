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

    public Loginpage(WebDriver driver){
        this.driver = WebDriverSingleton.getInstance().getDriver();
    }

    public void enterEmail(){
        WebElement emailField = WebDriverSingleton.getInstance().getDriver().findElement(ObejRepo.emailID);
        emailField.sendKeys(propertiesReader.getEmail());
    }

    public void enterPass(){
        WebElement passField = WebDriverSingleton.getInstance().getDriver().findElement(ObejRepo.passID);
        passField.sendKeys(propertiesReader.getPass());
    }

    public void clickOnSubmit(){
        WebElement submit = WebDriverSingleton.getInstance().getDriver().findElement(ObejRepo.submitID);
        submit.click();
    }

    public void enterInvalidEmail(){
        WebElement emailField = driver.findElement(ObejRepo.emailID);
        emailField.sendKeys(propertiesReader.getEmail());
    }

    public void waitEmail(){
        wait = new WebDriverWait(this.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ObejRepo.emailID));
    }
}
