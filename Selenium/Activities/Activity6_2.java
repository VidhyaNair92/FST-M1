package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity6_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://training-support.net/selenium/ajax");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        driver.findElement(By.cssSelector(".violet")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"HELLO!"));
        String text = driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText();
        System.out.println("Text is: " +text);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("ajax-content"),"I'm late!"));
        String newText = driver.findElement(By.xpath("//div[@id='ajax-content']/h3")).getText();
        System.out.println("New Text is: " +newText);
        driver.close();
    }
}
