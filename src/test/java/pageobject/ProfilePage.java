package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {

    //локатор "Конструктор"
    @FindBy(xpath ="//p[text()='Конструктор']")
    public static SelenideElement constructorLink;

    //локатор логотипа
    @FindBy(xpath ="//div[@class='AppHeader_header__logo__2D0X2']")
    public static SelenideElement logo;

    //Локатор кнопки Выход
    @FindBy(xpath = "//button[text()='Выход']")
    public static SelenideElement logoutButton;


    public static void constructorLinkClick(){
        constructorLink.click();
    }

    public static void logoClick(){
        logo.click();
    }

    public static void logoutButtonClick(){
        logoutButton.click();
    }
}
