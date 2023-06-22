package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebTables {
    protected WebDriver driver; // driver
    private WebElement WebTablesField;

    public WebTables(WebDriver driver) {
        this.driver = driver;
        WebTablesField = driver.findElement(By.id("searchBox"));


    }

    public void webTables() {
        WebElement webElement = WebTablesField;
        Actions WebTablesField = new Actions(driver);
        WebTablesField.moveToElement(webElement).click(webElement);
        WebTablesField.perform();
    }



}


