package au.com.automation.pageObjects;

import au.com.automation.helper.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
    public static By userName =By.xpath("//*[@id='session_key']");
    private static WebElement element = null;
    WaitHelper waitHelper;

    public static WebElement userName(WebDriver driver) {
        element = driver.findElement(userName);
        return element;
    }
    public static WebElement password(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='session_password']"));
        return element;
    }
    public static WebElement signInButton(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@class='sign-in-form__submit-button']"));
        return element;
    }


}
