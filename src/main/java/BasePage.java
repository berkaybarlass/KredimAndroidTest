import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.soap.Text;


public class BasePage {

    AppiumDriver driver;
    public static final long WAIT = 10;

    public BasePage(AppiumDriver appiumDriver){
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver),this);
        driver = appiumDriver;
    }

    public void waitForVisibility(MobileElement element){
        WebDriverWait wait = new WebDriverWait(driver, WAIT);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clear(MobileElement element){
        waitForVisibility(element);
        element.clear();
    }

    public void click(MobileElement element){
        waitForVisibility(element);
        element.click();
        System.out.println(element.getText() + " is clicked");


    }

    public void sendText(MobileElement element, String text){
        waitForVisibility(element);
        element.sendKeys(text);
        System.out.println("Filling " + text + " in " + element.getText());
    }

    public String getAttribute(MobileElement element, String attribute){
        waitForVisibility(element);
        return element.getAttribute(attribute);
    }

    public void  verifyPage(MobileElement element, String text, String pageVerif){
        waitForVisibility(element);
        if(driver.getPageSource().contains(text)){
            System.out.println(pageVerif + " is present !");
        }else{
            System.out.println(pageVerif + " is not present !!!");
        }

    }

    public void changeEnv(MobileElement element){
        waitForVisibility(element);
        element.click();
        element.click();
        element.click();
        element.click();
        element.click();
        element.click();
        element.click();
        element.click();
        element.click();
        element.click();

    }
}
