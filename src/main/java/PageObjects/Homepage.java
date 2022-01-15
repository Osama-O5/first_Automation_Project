package PageObjects;

import Utils.ObejRepo;
import Utils.PropertiesReader;
import Utils.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    WebDriver driver;
    PropertiesReader propertiesReader;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSignIn() {
        WebElement siginIn = WebDriverSingleton.getInstance().getDriver().findElement(ObejRepo.signinID);
        siginIn.click();
    }
}
