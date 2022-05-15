package tests;

import helper.User;
import helper.UserClient;
import io.qameta.allure.Description;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pageobject.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;

import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static pageobject.RegistrationPage.registrationButton;


public class RegistrationPageTest {
    UserClient userClient=new UserClient();
    User user;

    @BeforeEach
    public void startUp() {
        RegistrationPage registrationPage =
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
    @DisplayName("Check registration with valid credentials")
    @Description("Basic ui test for registration")
    public void registrationWithValidCredentialsTest() {
        this.user=new User("Софья","sonic@gmail.com","123456");
        RegistrationPage.setRegistrationForm(this.user);
        webdriver().shouldHave(url("https://stellarburgers.nomoreparties.site/login"));

    }

    @Test
    @DisplayName("Check registration with invalid credentials")
    @Description("Basic ui test for registration")
    public void registrationWithInvalidCredentialsTest() {
        User user=new User("Маша","sonyaklmnoprstufhcchsh@gmail.com","12345");
        RegistrationPage.setRegistrationForm(user);
        assertTrue(RegistrationPage.passwordMessage.isDisplayed());
        webdriver().shouldHave(url("https://stellarburgers.nomoreparties.site/register"));
    }
}
