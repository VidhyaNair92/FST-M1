package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(" https://training-support.net/selenium/dynamic-attributes");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        String username = "Vidhya";
        driver.findElement(By.xpath("(//input[contains(@class,'username')])[2]")).sendKeys(username);
        driver.findElement(By.xpath("(//input[contains(@class,'password')])[2]")).sendKeys("pass123");
        driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input[1]")).sendKeys("pass123");
        driver.findElement(By.xpath("//input[starts-with(@class,'email')]")).sendKeys("vidhya12@gmail.com");
        driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("action-confirmation"),"Thank you for registering, "+username));
        String message =  driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("The text is: " +message);
        driver.close();

    }
}
