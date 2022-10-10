import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class RegisterPageTest  extends TestBase{

    RegisterPage registerPage;

    @Test
    public void succsessfullRegister() throws MalformedURLException{
        AndroidSetup();
        registerPage = new RegisterPage(driver);
        registerPage.envChange();
        registerPage.goToSighUp();
        registerPage.enterNewUserPhoneNumber("5393509493");
        registerPage.nextPage();
        registerPage.enterUserName("Berkay");
        registerPage.enterUserSurname("Barlas");
        registerPage.enterTcNo("55792114756");
        registerPage.clickCheckboxAndGoToNextPage();
        //şifre ekranında sorun var
        registerPage.enterNewPassword("237529");
        registerPage.enterVerifyPassword("237529");
        registerPage.startApp();

    }
}
