package rossko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonPopularProductsSparkPlugs {
    protected WebDriver driver; // driver

    private WebElement sparkPlugs;
    private WebElement Sp122sparkPlugs;


    public ButtonPopularProductsSparkPlugs(WebDriver driver) {
        this.driver = driver;
    }
    public void buttonPopularProductsSparkPlugs() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        sparkPlugs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Свечи обычные (стандарт)\"]")));
        sparkPlugs.click();
        Sp122sparkPlugs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@data-goods-item=\"NSII0019854109\"]")));
        Sp122sparkPlugs.click();
    }
}