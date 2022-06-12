package helper;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageobject.LoginPage;
import pageobject.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static helper.Paths.REGISTRATION_PAGE_URL;
import static helper.YandexBrowserSetUp.yandexBrowserSetUp;

public class RegistrationBase {
    UserClient userClient = new UserClient();
    public User user;
    public RegistrationPage registrationPage;
    public LoginPage loginPage;

    @BeforeEach
    public void teartUp() {
      //  System.setProperty("webdriver.chrome.driver","/Users/sofia/Stellar Burgers UI/yandexdriver");
      //  WebDriver driver =new ChromeDriver();
      //  setWebDriver(driver);
        yandexBrowserSetUp();
        registrationPage =
                open(REGISTRATION_PAGE_URL,
                        RegistrationPage.class);

    }

    @AfterEach
    public void tearDown() {
        if (this.user == null) {
            return;
        }
        userClient.userDelete(this.user);
        this.user = null;
    }
}
