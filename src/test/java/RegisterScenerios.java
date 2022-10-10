import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class RegisterScenerios {

    public WebDriverWait wait;
    public AndroidDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("udid", "emulator-5554"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "com.param.kredim");
        caps.setCapability("appActivity","com.tatavla.android.kredimwv.ui.splash.SplashActivity");
        caps.setCapability("noReset","false");
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4724/wd/hub"),caps);
        wait = new WebDriverWait(driver, 50);
    }


    @Test
    public  void validRegister() {
        driver.findElementById("com.param.kredim:id/kayitButton").click();
        driver.findElementById("com.param.kredim:id/giristelefonedittext").click();
        driver.findElementById("com.param.kredim:id/giristelefonedittext").sendKeys("5393509493");
        driver.findElementById("com.param.kredim:id/ilerle").click();
        driver.findElementById("com.param.kredim:id/isimform").click();
        driver.findElementById("com.param.kredim:id/isimform").sendKeys("Berkay");
        driver.findElementById("com.param.kredim:id/soyadform").click();
        driver.findElementById("com.param.kredim:id/soyadform").sendKeys("Barlas");
        driver.findElementById("com.param.kredim:id/tcform").click();
        driver.findElementById("com.param.kredim:id/tcform").sendKeys("55792114756");
        driver.findElementById("com.param.kredim:id/checkBox").click();
        driver.findElementById("com.param.kredim:id/ilerleKisisel").click();
        driver.findElementById("com.param.kredim:id/ilksifre").click();
        driver.findElementById("com.param.kredim:id/ilksifre").sendKeys("237529");
        driver.findElementById("com.param.kredim:id/ikincisifre").click();
        driver.findElementById("com.param.kredim:id/ikincisifre").sendKeys("237529");
        driver.findElementById("com.param.kredim:id/kaydol").click();
        driver.findElementById("android:id/button1").click();
        driver.findElementById("com.param.kredim:id/giristelefonedittext").sendKeys("5393509493");
        driver.findElementById("com.param.kredim:id/girissifreedittext").sendKeys("237529");
        driver.findElementById("com.param.kredim:id/girislogin").click();
        driver.findElementById("com.param.kredim:id/checkBox").click();
        driver.findElementById("com.param.kredim:id/ilerleKisisel").click();
        driver.findElementById("android:id/button1").click();
    }


    @After
    public void tearDown() {
        driver.quit();
    }
}


