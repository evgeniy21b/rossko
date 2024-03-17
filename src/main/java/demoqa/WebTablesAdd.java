package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesAdd {
    protected WebDriver driver; // driver
    public WebTablesAdd(WebDriver driver) {
       this.driver = driver;
    }
    /* Тест нажимает на кнопку Add
                ждем появления полей
                Нажимает на поле FirstNameField
                Вводим текст "Evgeniy"
                Нажимает на поле LastNameField
                Вводим текст "Burger"
                Нажимаем на кнопку Submit
             */
    private void Click(String description, String method, String locator, String... text) {
        WebDriverWait wait = new WebDriverWait(driver,6);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locator)));
        WebElement thisElement = driver.findElement(By.id(locator));
        thisElement.click();
        if (text.length > 0 && text[0] != null && !text[0].isEmpty()) {
            // Если передан текст, вводим его в элемент
            thisElement.sendKeys(text[0]);
        }
    }
    public void webTablesAdd() { //!ждем появления полей
            Click("Кнопка Add", "id", "addNewRecordButton");
            Click("Поле FirstName", "id", "firstName", "Evgeniy");
            Click("Поле LastNameField", "id", "lastName", "Burger");
            Click("Поле Email", "id", "userEmail", "berezin@yandex.ru");
            Click("Поле Age", "id", "age", "28");
            Click("Поле Salary", "id", "salary", "2000");
            Click("Поле Department", "id", "department", "Programming");
            Click("Кнопка Submit", "id", "submit");
    }
}


