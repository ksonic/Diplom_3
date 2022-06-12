package pageobject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

public class ResetPasswordPage {
    //Локатор кнопки "Войти" со страницы восстановления пароля
    @FindBy(xpath = "//a[text()='Войти']")
    public static SelenideElement loginFromResetPasswordPageButton;

    public void clickLoginFromResetPasswordPageButton() {
        loginFromResetPasswordPageButton.click();
    }
}
