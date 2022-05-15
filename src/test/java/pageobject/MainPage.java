package pageobject;

import com.codeborne.selenide.SelenideElement;
import helper.User;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    //Локатор кнопки "Войти в аккаунт" с главной страницы
    @FindBy(xpath = "//button[text()='Войти в аккаунт']")
    public static SelenideElement MainPageLoginButton;

    //Локатор кнопки "Личный кабинет" с главной страницы
    @FindBy(xpath = "//p[text()='Личный Кабинет']")
    public static SelenideElement AccountLoginButton;

    //локатор раздела Булки
    @FindBy(xpath ="//span[text()='Булки']")
    public static SelenideElement bunsSection;

    //локатор раздела Соусы
    @FindBy(xpath ="//div/span[text()='Соусы']")
    //@FindBy(xpath ="//div[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect']")
    public static SelenideElement saucesSection;

    @FindBy(xpath ="//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']")
    public static SelenideElement saucesActiveSection;


    //локатор раздела Начинки
    @FindBy(xpath ="//div/span[text()='Начинки']")
    //@FindBy(xpath ="/html/body/div/div/main/section[1]/div[1]/div[3]/span")
   // @FindBy(xpath ="//div[@class='tab_tab__1SPyG  pt-4 pr-10 pb-4 pl-10 noselect'][2]")
    public static SelenideElement fillingsSection;

    //локатор раздела Булки
    @FindBy(xpath ="//h2[text()='Булки']")
    public static SelenideElement buns;

    //локатор подзаголовка Соусы
    @FindBy(xpath ="//h2[text()='Соусы']")
    public static SelenideElement sauces;


    //локатор подзаголовка Начинки
    @FindBy(xpath ="//h2[text()='Начинки']")
    //@FindBy(xpath ="//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']//h2[text()='Начинки']")
    public static SelenideElement fillings;


    // метод клика по разделу Булки
    public static void bunsSectionClick(){
        bunsSection.click();
    }

    // метод клика по разделу Соусы
    public static void saucesSectionClick(){
        saucesSection.click();
    }

    // метод клика по разделу Начинки
    public static void fillingsSectionClick(){
        fillingsSection.click();
    }


    // Метод клика по кнопке Войти в аккаунт с главной страницы
    public static void mainPageLoginButtonClick() {
       MainPageLoginButton.click();
}

    // Метод клика по кнопке Личный кабинет с главной страницы
    public static void accountLoginButtonClick() {
        AccountLoginButton.click();
    }
}
