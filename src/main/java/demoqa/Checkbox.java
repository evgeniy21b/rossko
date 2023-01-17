package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkbox {

    protected WebDriver driver; // driver
    private WebElement checkBoxIcon;

    public Checkbox(WebDriver driver) {
        this.driver = driver;
        checkBoxIcon = driver.findElement(By.xpath("//span[@class='rct-checkbox']"));


    }

    public void checkBox() { // только
    checkBoxIcon.click();
    }

}
