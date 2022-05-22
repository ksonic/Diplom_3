package tests;

import helper.RegistrationBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static helper.Credentials.getValidUserCredentials;
import static helper.Paths.LOGIN_PAGE_URL;

public class LogoutTest extends RegistrationBase {

    @BeforeEach
    public void teartUp() {
        super.teartUp();
        this.user = getValidUserCredentials();
        registrationPage.setRegistrationForm(this.user);

        loginPage =
                open(LOGIN_PAGE_URL, LoginPage.class);
        loginPage.setLoginForm(this.user);
        loginPage.accountLoginButtonClick();
    }

    @Test
    @DisplayName("Check logout by Logout button from personal account page")
    @Description("Basic ui test for pages transition")
    public void checkLogoutTest() {
        loginPage.logoutButtonClick();
        webdriver().shouldHave(url(LOGIN_PAGE_URL));
    }

}
