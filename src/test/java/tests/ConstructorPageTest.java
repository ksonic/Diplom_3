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
import static helper.Paths.BASE_URL;
import static helper.Paths.LOGIN_PAGE_URL;

public class ConstructorPageTest extends RegistrationBase {

    @Override
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
    @DisplayName("Check transition from a personal account to constructor by Constructor button")
    @Description("Basic ui test for pages transition")
    public void constructorLinkTest() {
        loginPage.constructorLinkClick();
        webdriver().shouldHave(url(BASE_URL));
    }

    @Test
    @DisplayName("Check transition from a personal account to constructor by logo")
    @Description("Basic ui test for pages transition")
    public void logoTest() {
        loginPage.logoClick();
        webdriver().shouldHave(url(BASE_URL));
    }

}
