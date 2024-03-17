package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class WebTables {
    protected WebDriver driver; // driver
    private WebElement WebTablesField;
    private WebElement WebElementEdit;
    private WebElement FirstNameField;
    private WebElement LastNameField;
    private WebElement SubmitBotton;

    public WebTables(WebDriver driver) {
        this.driver = driver;
        WebTablesField = driver.findElement(By.id("searchBox"));
        WebElementEdit = driver.findElement(By.id("edit-record-3"));
        // FirstNameField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
       // LastNameField = driver.findElement(By.id("lastName"));
      // SubmitBotton = driver.findElement(By.id("submit"));

    }

    public void webTables() {
        WebTablesField.click();
        WebTablesField.sendKeys("Kierra");
        //WebElementEdit.click();
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // FirstNameField.click();
       // FirstNameField.clear();
        //FirstNameField.sendKeys("Evgeniy");
       // LastNameField.click();
       // LastNameField.clear();
       // LastNameField.sendKeys("Berezin");
       // SubmitBotton.click();
    }
}


