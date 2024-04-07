package rossko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BoxFeedbackForm {
    protected WebDriver driver; // driver

    public BoxFeedbackForm(WebDriver driver) {
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
        WebDriverWait wait = new WebDriverWait(driver, 6);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
        WebElement thisElement = driver.findElement(By.xpath(locator));
        thisElement.click();
        if (text.length > 0 && text[0] != null && !text[0].isEmpty()) {
            // Если передан текст, вводим его в элемент
            thisElement.sendKeys(text[0]);
        }
    }

    public void BoxFeedbackForm() {
        Click("Поле MyNumber", "Xpath", "//input[@data-mask=\"+7 999 999-99-99\"]", "9937674312");
        Click("Поле iFind", "Xpath", "//input[@name=\"zapchastzxcfwqqnh\"]", "Тормозные колодки");
        Click("Поле Car number", "Xpath", "//input[@name=\"numberautodjglc\"]", "М600М");
        Click("Поле Car region", "Xpath", "//input[@name=\"regionautofhydt\"]", "999");
        Click("Кнопка Submit", "Xpath", "//button[@type=\"submit\"]");
       /* Click("Поле Salary", "id", "salary", "2000");
        Click("Поле Department", "id", "department", "Programming");
        Click("Кнопка Submit", "id", "submit"); */
        }
    }
