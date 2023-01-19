package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class  Radiobutton {

    protected WebDriver driver; // driver
    private WebElement RadiobuttonIcon;

    public Radiobutton(WebDriver driver) {
        this.driver = driver;
        RadiobuttonIcon = driver.findElement(By.id("yesRadio"));  // надо поправить xpath


    }

    public void radioButton() {
        WebElement webElement = driver.findElement(By.id("yesRadio"));
        Actions RadiobuttonIcon = new Actions(driver);
        RadiobuttonIcon.moveToElement(webElement).click(webElement);
        RadiobuttonIcon.perform();
    }



}
