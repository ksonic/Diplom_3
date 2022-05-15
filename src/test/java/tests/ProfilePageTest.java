package tests;

import helper.User;
import helper.UserClient;
import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.LoginPage;
import pageobject.MainPage;
import pageobject.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static helper.Helper.BASE_URL;

public class ProfilePageTest {
    UserClient userClient=new UserClient();
    User user;

       @BeforeEach
    public void startUp() {
        RegistrationPage registrationPagePage =
                open("https://stellarburgers.nomoreparties.site/register",
                        RegistrationPage.class);

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
    @DisplayName("Check transition to a personal account page by Account button")
    @Description("Basic ui test for pages transition")
    public void mainPageLoginTest() {
        user=new User("Софья", "sonic@gmail.com", "123456");
        RegistrationPage.setRegistrationForm(this.user);

        LoginPage loginPage =
                open(BASE_URL+"login", LoginPage.class);
        LoginPage.setLoginForm(this.user);
        LoginPage.accountLoginButtonClick();
        webdriver().shouldHave(url("https://stellarburgers.nomoreparties.site/account/profile"));

    }

}
