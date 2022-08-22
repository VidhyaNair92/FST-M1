package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        driver.findElement(By.id("simple")).click();
        Alert alt = driver.switchTo().alert();
        System.out.println("Alert text is : " +alt.getText());
        alt.accept();
        driver.close();
    }
}
