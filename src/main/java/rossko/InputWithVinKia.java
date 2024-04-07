package rossko;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputWithVinKia {

    protected WebDriver driver; // driver
    private WebElement KnaAuto;
    private WebElement searchVIN;
    private WebElement rightButton;
    private WebElement fuelFilter;
    private WebElement searchRedButton;
    private WebElement firstVariable;






    public InputWithVinKia(WebDriver driver) {
        this.driver = driver;
    }

    public void inputWithVinKia() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        KnaAuto = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='KNAJP811BF7104704']")));
        KnaAuto.click();
        searchVIN = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-narrowing-vehicle-search]")));
        searchVIN.click();
        rightButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-narrowing-vehicle-confirm=\"80139\"]")));
        rightButton.click();
        fuelFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-id=\"271\"]")));
        fuelFilter.click();
        searchRedButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=\"narrowing-search-button red d768\"]")));
        searchRedButton.click();
        firstVariable = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@data-goods-item=\"NSII0006972188\"]")));
        firstVariable.click();
    }
}
