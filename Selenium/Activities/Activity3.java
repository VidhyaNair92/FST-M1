package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/simple-form");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        firstName.sendKeys("VidhyaJJ");
        lastName.sendKeys("Jith");
        WebElement email = driver.findElement(By.id("email"));
        WebElement number = driver.findElement(By.id("number"));
        email.sendKeys("vidhya12@gmail.com");
        number.sendKeys("8565852458");
        WebElement submitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        submitBtn.click();
       driver.close();
    }
}
