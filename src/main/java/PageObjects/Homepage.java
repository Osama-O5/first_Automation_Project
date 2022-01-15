package PageObjects;

import Utils.ObejRepo;
import Utils.WebDriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
    WebDriver driver;
    WebDriverWait wait;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 30);
    }

    public void clickOnSignIn() {
        wait.until(ExpectedConditions.elementToBeClickable(ObejRepo.signinID));
        WebElement siginIn = WebDriverSingleton.getInstance().getDriver().findElement(ObejRepo.signinID);
        siginIn.click();
    }

}
