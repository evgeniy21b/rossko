package rossko;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonHowFindVin {
    protected WebDriver driver; // driver

    private WebElement howFiendVinButton;
    private WebElement ptsButton;
    private WebElement okButton;

    public ButtonHowFindVin(WebDriver driver) {
        this.driver = driver;
    }



    public void buttonHowFindVIN() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        howFiendVinButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class=\"red-text\"][@tabindex=\"-1\"]")));
        howFiendVinButton.click();
        ptsButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@data-call-block=\"wherevin.pts\"]")));
        ptsButton.click();
        okButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"text\"]//button[@class=\"red m-full d768\"]")));
        okButton.click();
    }
}
