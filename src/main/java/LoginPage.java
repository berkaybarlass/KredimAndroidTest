
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {

    public LoginPage(AppiumDriver appiumDriver){
        super(appiumDriver);
    }

    @AndroidFindBy(id = "com.param.kredim:id/giristelefonedittext")
    MobileElement phoneNumberInput;

    @AndroidFindBy(id = "com.param.kredim:id/girissifreedittext")
    MobileElement passwordInput;

    @AndroidFindBy(id = "com.param.kredim:id/girislogin")
    MobileElement loginButton;

    @AndroidFindBy(id = "com.param.kredim:id/textinput_error")
    MobileElement emptyLoginError;



    public void enterPhoneNumber(String validPhoneNumber){
        click(phoneNumberInput);
        sendText(phoneNumberInput, validPhoneNumber);
    }

    public void enterPassword(String validPassword){
        click(passwordInput);
        sendText(passwordInput, validPassword);
    }

    public void clickLogin(){
        click(loginButton);
    }

    public void verifyEmptyLogin(){

        verifyPage(emptyLoginError, "Telefon numaran 10 haneli olmalı.", "Telefon numaran 10 haneli olmalı.");
    }

    public void verifyEmptyPassword(){

        verifyPage(emptyLoginError, "Geçersiz şifre", "Geçersiz şifre");
    }

    public void verifyNonMemberLogin(){
        verifyPage(emptyLoginError, "Bilgilerini kontrol edip lütfen tekrar dene.", "Bilgilerini kontrol edip lütfen tekrar dene." );
    }


}
