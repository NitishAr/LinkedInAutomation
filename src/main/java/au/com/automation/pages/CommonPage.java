package au.com.automation.pages;

import au.com.automation.helper.WaitHelper;
import au.com.automation.pageObjects.CommonPageObjects;
import org.openqa.selenium.WebDriver;

public class CommonPage extends TestBase{

    public CommonPage(WebDriver driver) {
        super(driver);
    }
    public static void signOut() throws InterruptedException {
        CommonPageObjects.myProfile(driver).click();
        WaitForElement(CommonPageObjects.signOut,2000);
        //Thread.sleep(4000);
        CommonPageObjects.signOut(driver).click();

    }
    public static String getTitle(){
      return  driver.getTitle();
        //LinkedIn: Log In or Sign Up
    }
}
