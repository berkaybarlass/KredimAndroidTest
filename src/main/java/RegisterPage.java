import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class RegisterPage  extends BasePage {

    public RegisterPage(AppiumDriver appiumDriver){super(appiumDriver);}

    @AndroidFindBy(id = "com.param.kredim:id/kayitButton")
    MobileElement SignUpButton;

    @AndroidFindBy(id = "com.param.kredim:id/giristelefonedittext")
    MobileElement phoneNumerInput;

    @AndroidFindBy(id = "com.param.kredim:id/ilerle")
    MobileElement nextButton;

    @AndroidFindBy(id = "com.param.kredim:id/isimform")
    MobileElement nameInput;

    @AndroidFindBy(id = "com.param.kredim:id/soyadform")
    MobileElement surnameInput;

    @AndroidFindBy(id = "com.param.kredim:id/tcform")
    MobileElement tcInput;

    @AndroidFindBy(id = "com.param.kredim:id/checkBox")
    MobileElement checkbox;

    @AndroidFindBy(id = "com.param.kredim:id/ilerleKisisel")
    MobileElement nextPersonalButton;

    @AndroidFindBy(id = "com.param.kredim:id/ilksifre")
    MobileElement firstPassword;

    @AndroidFindBy(id = "com.param.kredim:id/ikincisifre")
    MobileElement secondPassword;

    @AndroidFindBy(id = "com.param.kredim:id/kaydol")
    MobileElement startAppUseButton;

    @AndroidFindBy(id = "android:id/button1")
    MobileElement nativeOkeyButton;

    @AndroidFindBy(id = "com.param.kredim:id/imageView")
    MobileElement imageView;

    public void envChange(){
        changeEnv(imageView);
        driver.findElement(By.id("android:id/button2")).click();
        //Native butonlarda driver üzerinden path verilmelidir.
    }

    public void goToSighUp(){
        waitForVisibility(SignUpButton);
        click(SignUpButton);
    }

    public void enterNewUserPhoneNumber(String newUserPhoneNumber){
        click(phoneNumerInput);
        sendText(phoneNumerInput, newUserPhoneNumber);
    }

    public void nextPage(){
        click(nextButton);
    }

    public void enterUserName(String name){
        click(nameInput);
        sendText(nameInput, name);
    }

    public void enterUserSurname(String surname){
        click(surnameInput);
        sendText(surnameInput, surname);
    }

    public void enterTcNo(String TcNo){
        click(tcInput);
        sendText(tcInput, TcNo);
    }

    public void clickCheckboxAndGoToNextPage(){
        click(checkbox);
        click(nextPersonalButton);
    }

    public void enterNewPassword(String newPassword){
        click(firstPassword);
        sendText(firstPassword, newPassword);
    }

    public void enterVerifyPassword(String newSecondPassword){
        click(secondPassword);
        sendText(secondPassword, newSecondPassword);
    }

    public void startApp(){
        click(startAppUseButton);
        click(nativeOkeyButton);
    }



}
