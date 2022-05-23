package helper;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
import static helper.Paths.YANDEXDRIVER_PATH;

public class YandexBrowserSetUp {
    public static void yandexBrowserSetUp() {
        File driverFile = new File(YANDEXDRIVER_PATH);
        System.setProperty("webdriver.chrome.driver", driverFile.getAbsolutePath());
        WebDriver driver = new ChromeDriver();
        setWebDriver(driver);
    }
}
