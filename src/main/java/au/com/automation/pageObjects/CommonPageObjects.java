package au.com.automation.pageObjects;

import au.com.automation.helper.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonPageObjects {
    public static By signOut= By.xpath("//*[text()='Sign Out']");
    private static WebElement element = null;
    WaitHelper waitHelper;

    public static WebElement myProfile(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@class='global-nav__me-photo ember-view']"));
        return element;
    }
    public static WebElement signOut(WebDriver driver) {
        element = driver.findElement(signOut);
        return element;
    }
}
