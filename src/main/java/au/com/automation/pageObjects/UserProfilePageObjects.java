package au.com.automation.pageObjects;

import au.com.automation.helper.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UserProfilePageObjects {
    public static By messageButton = By.xpath("//*[@class='message-anywhere-button pv-s-profile-actions pv-s-profile-actions--message ml2 artdeco-button artdeco-button--2 artdeco-button--primary']");
    public static By sendButton= By.xpath("//*[text()='Send']");
    public static By crossMessageBox = By.xpath("//*[@data-control-name='overlay.close_conversation_window']");
    private static WebElement element = null;
    WaitHelper waitHelper;

    public static WebElement messageButton(WebDriver driver) {
        element = driver.findElement(messageButton);
        return element;
    }
    public static WebElement enterMessage(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@class='msg-form__contenteditable t-14 t-black--light t-normal flex-grow-1 notranslate']"));
        return element;
    }

    public static WebElement crossMessageBox(WebDriver driver) {
        element = driver.findElement(crossMessageBox);
        return element;
    }

    public static WebElement sendButton(WebDriver driver) {
        element = driver.findElement(sendButton);
        return element;
    }
}
