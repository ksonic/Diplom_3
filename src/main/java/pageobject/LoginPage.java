package pageobject;

import com.codeborne.selenide.SelenideElement;
import helper.User;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ProfilePage {
    //локатор заголовка "Вход"
    @FindBy(xpath = "//h2[text()='Вход']")
    public static SelenideElement loginHeader;

    //локатор поля ввода Email
    @FindBy(xpath = "//input[@name='name']")
    public static SelenideElement emailLoginInput;

    //локатор поля ввода Пароль
    @FindBy(xpath = "//input[@name='Пароль']")
    public static SelenideElement passwordLoginInput;

    //Локатор кнопки Зарегистрироваться
    @FindBy(xpath = "//button[text()='Войти']")
    public static SelenideElement loginButton;

    //Локатор кнопки "Личный кабинет" с главной страницы
    @FindBy(xpath = "//p[text()='Личный Кабинет']")
    public static SelenideElement accountLoginButton;

    // метод заполнения полей формы регистрации
    public void setLoginForm(User user) {
        emailLoginInput.setValue(user.email);
        passwordLoginInput.setValue(user.password);
        loginButton.click();
    }

    public void accountLoginButtonClick() {
        accountLoginButton.click();
    }


}
