package helper;

import org.junit.jupiter.api.BeforeEach;
import pageobject.MainPage;
import pageobject.RegistrationPage;
import pageobject.ResetPasswordPage;

import static com.codeborne.selenide.Selenide.open;
import static helper.Paths.*;
import static helper.YandexBrowserSetUp.yandexBrowserSetUp;

public class MainPageBase {
    public MainPage mainPage;

    @BeforeEach
    public void teartUp() {
        yandexBrowserSetUp();
        mainPage =
                open(BASE_URL,
                        MainPage.class);

    }
}
