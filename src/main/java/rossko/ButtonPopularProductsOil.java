package rossko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonPopularProductsOil {
    protected WebDriver driver; // driver

    private WebElement syntheticEngineOil;
    private WebElement NgNBottonOil;


    public ButtonPopularProductsOil(WebDriver driver) {
        this.driver = driver;
    }
    public void buttonPopularProductsOil() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        syntheticEngineOil = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Синтетическое\"][@href=\"/catalog/motornye-masla/?feature_ids[22][]=160\"]")));
        syntheticEngineOil.click();
        NgNBottonOil = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@data-goods-item=\"NSIN0023154755\"]")));
        NgNBottonOil.click();
    }
}

