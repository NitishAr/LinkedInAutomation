package au.com.automation.pages;

import au.com.automation.pageObjects.CommonPageObjects;
import au.com.automation.pageObjects.HomePageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends TestBase {
   // static WebDriverWait wait = new WebDriverWait(driver,8);
    public static Actions action = new Actions(driver);
    public HomePage(WebDriver driver) {
        super(driver);

    }
    public static void seacrhUserProfile(String userProfileName) throws InterruptedException {
        // Enter the user details
        WaitForElement(HomePageObjects.searchBox,10);
        HomePageObjects.searchBox(driver).sendKeys(userProfileName);
        action.sendKeys(Keys.ENTER).build().perform();


    }
    public static void clickUserProfile() throws InterruptedException {
        // Enter the user details
        WaitForElement(HomePageObjects.SearchResult,2000);
        HomePageObjects.SearchResult(driver).click();

    }
    public static void clickMessageButton() throws InterruptedException {
        // Enter the user details
        //waitHelper.WaitForElement( HomePageObjects.buttonMessage(driver),8);
        HomePageObjects.buttonMessage(driver).click();

    }
    public static String  getUserNameValue(){
        return HomePageObjects.getLoggedUserName(driver).getText();
    }

}
