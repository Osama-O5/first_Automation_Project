package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

    WebDriver driver ;
    PropertiesReader propertiesReader = new PropertiesReader();

    private static WebDriverSingleton webDriverSingleton = null;

    private WebDriverSingleton(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(propertiesReader.getUrl());
    }

    public static WebDriverSingleton getInstance(){
        if (webDriverSingleton == null){
            webDriverSingleton = new WebDriverSingleton();
        }
        return webDriverSingleton;
    }

    public WebDriver getDriver() {
        return driver;
    }
}
