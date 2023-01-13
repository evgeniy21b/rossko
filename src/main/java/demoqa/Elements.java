package demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Elements {

    protected WebDriver driver; // driver
    private WebElement fieldFullName;
    private WebElement fieldEmail;
    private WebElement fieldCurAdress;
    private WebElement fieldPerAdress;
    private WebElement submitButton;



    public Elements(WebDriver driver) {
        this.driver = driver;
        fieldFullName = driver.findElement(By.id("userName"));
        fieldEmail = driver.findElement(By.id("userEmail"));
        fieldCurAdress = driver.findElement(By.id("currentAddress"));
        fieldPerAdress = driver.findElement(By.id("permanentAddress"));
        submitButton = driver.findElement(By.id("submit"));

    }

    public void textBox() { // только textbox
        fieldFullName.click();
        fieldFullName.sendKeys("Evgeniy Vegan");
        fieldEmail.click();
        fieldEmail.sendKeys("berezin.e1@yandex.ru");
        fieldCurAdress.click();
        fieldCurAdress.sendKeys("SPB Pushkina street, Kolotushkina house");
        fieldPerAdress.click();
        fieldPerAdress.sendKeys("SPB Pushkina street, Kolotushkina house");
        submitButton.click();
    }
}
