package tests;

import helper.RegistrationBase;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.LoginPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static helper.Credentials.getValidUserCredentials;
import static helper.Paths.LOGIN_PAGE_URL;
import static helper.Paths.PROFILE_PAGE_URL;

public class ProfilePageTest extends RegistrationBase {
    LoginPage loginPage;

    @Test
    @DisplayName("Check transition to a personal account page by Account button")
    @Description("Basic ui test for pages transition")
    public void mainPageLoginTest() {
        this.user = getValidUserCredentials();
        registrationPage.setRegistrationForm(this.user);

        loginPage =
                open(LOGIN_PAGE_URL, LoginPage.class);
        loginPage.setLoginForm(this.user);
        loginPage.accountLoginButtonClick();
        webdriver().shouldHave(url(PROFILE_PAGE_URL));

    }

}
