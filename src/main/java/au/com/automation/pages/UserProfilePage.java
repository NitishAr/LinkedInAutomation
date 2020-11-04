package au.com.automation.pages;

import au.com.automation.pageObjects.HomePageObjects;
import au.com.automation.pageObjects.UserProfilePageObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.jws.soap.SOAPBinding;

public class UserProfilePage extends TestBase{
    static WebDriverWait wait = new WebDriverWait(driver,8);
    public static Actions action = new Actions(driver);
    public UserProfilePage(WebDriver driver) {
        super(driver);
    }
    public static void sendMessage(String textMessage) throws InterruptedException {
        // Enter the user details
        WaitForElement(UserProfilePageObjects.messageButton,8);
        UserProfilePageObjects.messageButton(driver).click();
        //wait.until(ExpectedConditions.visibilityOf(UserProfilePageObjects.enterMessage(driver)));
        UserProfilePageObjects.enterMessage(driver).sendKeys(textMessage);
        WaitForElementClicable(UserProfilePageObjects.sendButton,10);
        UserProfilePageObjects.sendButton(driver).click();
        //wait.until(ExpectedConditions.visibilityOf(UserProfilePageObjects.crossMessageBox(driver)));
        WaitForElement(UserProfilePageObjects.crossMessageBox,4);
        UserProfilePageObjects.crossMessageBox(driver).click();

    }

}
