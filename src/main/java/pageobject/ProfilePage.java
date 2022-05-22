package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage {

    //локатор "Конструктор"
    @FindBy(xpath = "//p[text()='Конструктор']")
    public static SelenideElement constructorLink;

    //локатор логотипа
    @FindBy(xpath = "//div[@class='AppHeader_header__logo__2D0X2']")
    public static SelenideElement logo;

    //Локатор кнопки Выход
    @FindBy(xpath = "//button[text()='Выход']")
    public static SelenideElement logoutButton;


    public void constructorLinkClick() {
        constructorLink.click();
    }

    public void logoClick() {
        logo.click();
    }

    public void logoutButtonClick() {
        logoutButton.click();
    }
}
