package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        driver.findElement(By.id("prompt")).click();
        Alert alt = driver.switchTo().alert();
        System.out.println("Alert text is: " +alt.getText());
        alt.sendKeys("Yes, you are!");
        alt.accept();
        driver.close();
    }
}
