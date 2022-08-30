package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity12_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/popups");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        WebElement signInBtn = driver.findElement(By.cssSelector(".orange"));
        Actions act = new Actions(driver);
        act.moveToElement(signInBtn).build().perform();
        System.out.println("Tooltip is: " +signInBtn.getAttribute("data-tooltip"));
        signInBtn.click();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String text = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Text is: " +text);
        driver.close();
    }
}
