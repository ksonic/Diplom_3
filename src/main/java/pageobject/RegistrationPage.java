package pageobject;

import com.codeborne.selenide.SelenideElement;
import helper.User;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
    //локатор заголовка "Регистрация"
    @FindBy(xpath = "//h2[text()='Регистрация']")
    public static SelenideElement registrationHeader;

    //локатор поля ввода Имя
    @FindBy(xpath = "//input[@name='name']")
    public static SelenideElement nameInput;

    //локатор поля ввода Email
    @FindBy(xpath = "//fieldset[2]//input[@name='name']")
    public static SelenideElement emailInput;

    //локатор поля ввода Пароль
    @FindBy(xpath = "//fieldset[3]//input[@name='Пароль']")
    public static SelenideElement passwordInput;

    //локатор валидационного сообщения о некорректном вводе пароля
    @FindBy(xpath = "//p[text()='Некорректный пароль']")
    public static SelenideElement passwordMessage;


    //Локатор кнопки Зарегистрироваться
    @FindBy(xpath = "//button[text()='Зарегистрироваться']")
    public static SelenideElement registrationButton;

    //Локатор кнопки "Войти в аккаунт" со страницы регистрации
    @FindBy(xpath = "//a[text()='Войти']")
    public static SelenideElement loginFromRegistrationPageButton;

    // метод заполнения полей формы регистрации
    public void setRegistrationForm(User user) {
        nameInput.setValue(user.name);
        emailInput.setValue(user.email);
        passwordInput.setValue(user.password);
        registrationButton.click();
    }

    public void loginFromRegistrationPageButtonClick() {
        loginFromRegistrationPageButton.click();
    }
}
