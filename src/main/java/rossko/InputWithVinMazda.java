package rossko;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputWithVinMazda {

    protected WebDriver driver; // driver
    private WebElement sgl5;
    private WebElement searchVIN;
    private WebElement rightButton;
    private WebElement timingBelt;
    private WebElement searchRedButton;
    private WebElement oneVariable;

    //WebElement assertText = driver.findElement(By.xpath("//div[@class=\"name-part name-part--text\"]"));




    public InputWithVinMazda(WebDriver driver) {
        this.driver = driver;
    }

    public void inputWithVinMazda() {
        // Явное ожидание появления элемента sgl5 в течение 10 секунд
        WebDriverWait wait = new WebDriverWait(driver, 10);
        sgl5 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='SGL5-400683']")));
        sgl5.click();
        searchVIN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-narrowing-vehicle-search]")));
        searchVIN.click();
        rightButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-narrowing-vehicle-confirm=\"85055\"]")));
        rightButton.click();
        timingBelt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-id=\"202\"]")));
        timingBelt.click();
        searchRedButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"narrowing-search-button red d768\"]")));
        searchRedButton.click();
        oneVariable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@data-goods-item=\"NSIN0005341421\"]")));
        oneVariable.click();
    }
}
