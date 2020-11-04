package au.com.automation.pageObjects;

import au.com.automation.helper.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
    private static WebElement element = null;
    WaitHelper waitHelper;

    public static WebElement searchBox(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@id='ember16']/input"));
        return element;
    }
    public static WebElement SearchResult(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@class='name actor-name']"));
        return element;
    }
    public static WebElement buttonMessage(WebDriver driver){
        element = driver.findElement(By.xpath("//*[@class='message-anywhere-button search-result__actions--primary artdeco-button artdeco-button--default artdeco-button--2 artdeco-button--secondary']"));
        return  element;
    }

    public static WebElement getLoggedUserName(WebDriver driver) {
        element = driver.findElement(By.xpath(" //*[@data-control-name='identity_welcome_message']"));
        return element;
    }
}
