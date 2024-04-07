package rossko;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputWithVinRenault {

    protected WebDriver driver; // driver
    private WebElement x7l5Auto;
    private WebElement searchVIN;
    private WebElement rightButton;
    private WebElement oilFilter;
    private WebElement searchRedButton;
    private WebElement secondVariable;






    public InputWithVinRenault(WebDriver driver) {
        this.driver = driver;
    }

    public void inputWithVinRenault() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        x7l5Auto = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='X7L5SRAVG55247528']")));
        x7l5Auto.click();
        searchVIN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-narrowing-vehicle-search]")));
        searchVIN.click();
        rightButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-narrowing-vehicle-confirm=\"83639\"]")));
        rightButton.click();
        oilFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-id=\"126\"]")));
        oilFilter.click();
        searchRedButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"narrowing-search-button red d768\"]")));
        searchRedButton.click();
        secondVariable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@data-goods-item=\"NSIN0005685123\"]")));
        secondVariable.click();
    }
}
