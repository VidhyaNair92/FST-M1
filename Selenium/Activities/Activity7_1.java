package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(" https://training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        driver.findElement(By.xpath("//input[starts-with(@class,'username')]")).sendKeys("admin");
        driver.findElement(By.xpath("//input[starts-with(@class,'password')]")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"),"Welcome Back, admin"));
        String message =  driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("The text is: " +message);
        driver.close();

    }
}
