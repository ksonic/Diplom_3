package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.cssClass;

public class MainPage {
    //Локатор кнопки "Войти в аккаунт" с главной страницы
    @FindBy(xpath = "//button[text()='Войти в аккаунт']")
    public static SelenideElement mainPageLoginButton;

    //Локатор кнопки "Личный кабинет" с главной страницы
    @FindBy(xpath = "//p[text()='Личный Кабинет']")
    public static SelenideElement accountLoginButton;

    //локатор раздела Булки
    @FindBy(xpath = "//span[text()='Булки']")
    public static SelenideElement bunsSection;

    //локатор раздела Соусы
    @FindBy(xpath = "//div/span[text()='Соусы']")
    public static SelenideElement saucesSection;

    //локатор раздела Начинки
    @FindBy(xpath = "//div/span[text()='Начинки']")
    public static SelenideElement fillingsSection;

    //локатор раздела Булки
    @FindBy(xpath = "//h2[text()='Булки']")
    public static SelenideElement buns;

    //локатор подзаголовка Соусы
    @FindBy(xpath = "//h2[text()='Соусы']")
    public static SelenideElement sauces;

    //локатор подзаголовка Начинки
    @FindBy(xpath = "//h2[text()='Начинки']")
    public static SelenideElement fillings;

    // метод клика по разделу Булки
    public void clickBunsSection() {
        bunsSection.click();
    }

    // метод клика по разделу Соусы
    public static void clickSaucesSection() {
        saucesSection.click();
    }

    // метод клика по разделу Начинки
    public void clickFillingsSection() {
        fillingsSection.click();
    }

    // метод проверки секции
    public void checkSection(SelenideElement section) {
        section.parent().shouldHave(cssClass("tab_tab_type_current__2BEPc"));
    }

    // Метод клика по кнопке Войти в аккаунт с главной страницы
    public void clickMainPageLoginButton() {
        mainPageLoginButton.click();
    }

    // Метод клика по кнопке Личный кабинет с главной страницы
    public void clickAccountLoginButton() {
        accountLoginButton.click();
    }

}
