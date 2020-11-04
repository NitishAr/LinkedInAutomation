package au.com.automation.pages;

import au.com.automation.helper.Constants;
import au.com.automation.pageObjects.LoginPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends TestBase{

    static WebDriverWait wait = new WebDriverWait(driver,8);
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public static void navigateToURL(){
        driver.get(Constants.mainUrl);

    }

    public static void enterLoginDetails(String username, String password) throws InterruptedException {
        // Enter the user details
        Thread.sleep(4000);
        //wait.until(ExpectedConditions.visibilityOf(LoginPageObjects.userName(driver)));
       LoginPageObjects.userName(driver).sendKeys(username);
       LoginPageObjects.password(driver).sendKeys(password);
       LoginPageObjects.signInButton(driver).click();


    }

}
