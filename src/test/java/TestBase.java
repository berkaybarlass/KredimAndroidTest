import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    public static AppiumDriver driver;

    public static void AndroidSetup() throws MalformedURLException{
        DesiredCapabilities androidCaps = new DesiredCapabilities();
        androidCaps.setCapability("udid", "emulator-5554");
        androidCaps.setCapability("platformName", "Android");
        androidCaps.setCapability("appPackage", "com.param.kredim");
        androidCaps.setCapability("appActivity", "com.tatavla.android.kredimwv.ui.splash.SplashActivity");
        androidCaps.setCapability("noReset", "false");
        androidCaps.setCapability("platformVersion","13.0");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), androidCaps);
        System.out.println("----------------------------------------------------");
        System.out.println("Test is started");

    }

    public static  void teardown(){
        driver.quit();
        System.out.println("Test is finished");


    }
}
