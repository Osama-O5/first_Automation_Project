package Utils;

import org.openqa.selenium.By;

public class ObejRepo {

    //Homepage
    public static By signinID = By.partialLinkText("Sign in");

    //login screen
    public static By emailID = By.id("email");
    public static By passID = By.id("passwd");
    public static By submitID = By.id("SubmitLogin");
    public static By headerID = By.className("page-heading");
    public static By errorMsg = By.xpath("//*[@id=\"center_column\"]/div[1]");
}
