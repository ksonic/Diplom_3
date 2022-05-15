package tests;

import helper.User;
import helper.UserClient;
import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.LoginPage;
import pageobject.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static helper.Helper.BASE_URL;

public class LogoutTest {
    UserClient userClient=new UserClient();
    User user;
    @BeforeEach
    public void startUp() {
        RegistrationPage registrationPagePage =
                open("https://stellarburgers.nomoreparties.site/register",
                        RegistrationPage.class);
        user=new User("Софья", "sonic@gmail.com", "123456");
        RegistrationPage.setRegistrationForm(this.user);

        LoginPage loginPage =
                open(BASE_URL+"login", LoginPage.class);
        LoginPage.setLoginForm(this.user);
        LoginPage.accountLoginButtonClick();
    }
    @AfterEach
    public void tearDown() {
        if (this.user == null){
            return;
        }
        userClient.userDelete(this.user);
        this.user = null;
    }

    @Test
    @DisplayName("Check logout by Logout button from personal account page")
    @Description("Basic ui test for pages transition")
    public void LogoutTest() {
        LoginPage.logoutButtonClick();
        webdriver().shouldHave(url("https://stellarburgers.nomoreparties.site/login"));
    }

}
