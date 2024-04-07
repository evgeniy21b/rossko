package rossko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputWithMagnifier {
    protected WebDriver driver; // driver
    public InputWithMagnifier(WebDriver driver) {
        this.driver = driver;
    }

    private void Click(String description, String method, String locator, String... text) {
        WebDriverWait wait = new WebDriverWait(driver,6);
        WebElement thisElement = null;
        switch (method) {
            case  ("Xpath"):
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
                 thisElement = driver.findElement(By.xpath(locator));
                break;
            case ("css"):
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator)));
                 thisElement = driver.findElement(By.cssSelector(locator));
                break;
            case ("id"):
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
                thisElement = driver.findElement(By.id(locator));
                break;
        }
        thisElement.click();

        if (text.length > 0 && text[0] != null && !text[0].isEmpty()) {
            // Если передан текст, вводим его в элемент
            thisElement.sendKeys(text[0]);
        }
    }
    public void inputWithMagnifier() {
        Click("В поле партномер вбить текст 21080101200508", "Xpath", "//*[@name=\"text\"]", "21080101200508");
        Click("Нажимаем на magnifier", "Xpath", "//*[@type=\"submit\"][@class=\"not-filled\"]");
       // Click("Проверяем наличие Результаты поиска «21080101200508»", "id", "age", "28");
    }
    }

