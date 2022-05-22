package helper;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class YandexBrowserSetUp {
    @BeforeEach
    public void teartUp(){
        yandexBrowserSetUp();
    }
    public static void yandexBrowserSetUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/sofia/Stellar_Burgers_UI/yandexdriver");
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
    }
}
