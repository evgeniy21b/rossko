package demoqa;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

public class BaseTest {
    protected WebDriver chromeDriver;

    @BeforeEach
    public void before() {
        WebDriverManager.chromedriver().setup(); // Используем WebDriverManager для установки chromedriver
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }

    //@AfterEach
    public void closeBellTest() {
        chromeDriver.quit();
    }
}