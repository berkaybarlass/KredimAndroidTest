
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class LoginPageTest extends TestBase{

    LoginPage loginPage;

    @Test(description = "Logged in with the valid user information"
            ,priority = 7, groups = {"REGRESSION", "SMOKE", "LOGIN", "TEST"} )
    @Parameters({"validPhoneNumber", "validPassword"})
    public void succsessfulLogin(String validPassword, String validPhoneNumber) throws MalformedURLException{
        AndroidSetup();
        loginPage = new LoginPage(driver);
        loginPage.enterPhoneNumber(validPhoneNumber);
        loginPage.enterPassword(validPassword);
        loginPage.clickLogin();
         teardown();
    }

    @Test(description = "The phone number and password were left blank and the login button was clicked"
            ,priority = 6, groups = {"REGRESSION", "SMOKE", "LOGIN", "TEST"} )
    public void emptyLogin()throws MalformedURLException{
        AndroidSetup();
        loginPage = new LoginPage(driver);
        loginPage.clickLogin();
        loginPage.verifyEmptyLogin();
        teardown();
    }


    @Test(description = "The password were left blank and the login button was clicked",
            invocationCount = 2 ,priority = 5, groups = {"REGRESSION", "SMOKE", "LOGIN", "TEST"} )
    @Parameters({"validPhoneNumber"})
    public void emptyPasswordLogin(String validPhoneNumber)throws MalformedURLException{
        AndroidSetup();
        loginPage = new LoginPage(driver);
        loginPage.enterPhoneNumber(validPhoneNumber);
        loginPage.clickLogin();
        // Hata mesajı kontrol edilecek !!
        loginPage.verifyEmptyPassword();
        teardown();
    }

    // Nonmember ve emptyPhoneNumber hata mesajları aynıdır o yüzden methodları hata mesajları değişene kadar tek kullanılacaktır.

    @Test(description = "The phone number were left blank and the login button was clicked",
            priority = 4, groups = {"REGRESSION", "SMOKE", "LOGIN", "TEST"} )
    @Parameters({"validPassword"})
    public void emptyPhoneNumberLogin(String validPassword) throws MalformedURLException{
        AndroidSetup();
        loginPage = new LoginPage(driver);
        loginPage.enterPassword(validPassword);
        loginPage.clickLogin();
        loginPage.verifyNonMemberLogin();
        teardown();
    }

    @Test(description = "The login button was clicked with the user who doesn't have a membership",
            priority = 3, groups = {"REGRESSION", "SMOKE", "LOGIN", "TEST"} )
    @Parameters({"NonMemberUserPhoneNumber", "validPassword"})
    public void nonMemberLogin(String NonMemberUserPhoneNumber ,String validPassword)throws MalformedURLException{
        AndroidSetup();
        loginPage = new LoginPage(driver);
        loginPage.click(loginPage.phoneNumberInput);
        loginPage.sendText(loginPage.phoneNumberInput, NonMemberUserPhoneNumber);
        loginPage.enterPassword(validPassword);
        loginPage.clickLogin();
        loginPage.verifyNonMemberLogin();
        teardown();
    }

    @Test(description = "The password was sent with a missing character",
            priority = 2, groups = {"REGRESSION", "SMOKE", "LOGIN", "TEST"})
    @Parameters({"validPhoneNumber", "invalidPasswordMissing"})
    public void missingPassword(String validPhoneNumber, String invalidPasswordMissing) throws MalformedURLException{
        AndroidSetup();
        loginPage = new LoginPage(driver);
        loginPage.enterPhoneNumber(validPhoneNumber);
        loginPage.enterPassword(invalidPasswordMissing);
        loginPage.clickLogin();
        loginPage.verifyEmptyPassword();
        teardown();
    }

    @Test(description = "The phone number was sent with a missing character",
            priority = 1, groups = {"REGRESSION", "SMOKE", "LOGIN", "TEST"} )
    @Parameters({"invalidPhoneNumberMissing", "validPassword"})
    public void missingNumber(String validPassword, String invalidPhoneNumberMissing ) throws MalformedURLException{
        AndroidSetup();
        loginPage = new LoginPage(driver);
        loginPage.enterPhoneNumber(invalidPhoneNumberMissing);
        loginPage.enterPassword(validPassword);
        loginPage.clickLogin();
        loginPage.verifyEmptyLogin();
        teardown();
    }



}
