package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity10_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/drag-drop");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement ballElement = driver.findElement(By.id("draggable"));
        WebElement dropZone1 = driver.findElement(By.id("droppable"));
        Actions act = new Actions(driver);
        act.dragAndDrop(ballElement,dropZone1).build().perform();
        WebElement dropZone2= driver.findElement(By.id("dropzone2"));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("droppable"),"Dropped!"));
        System.out.println("Ball has entered Dropzone 1");
        act.dragAndDrop(dropZone1,dropZone2).build().perform();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("dropzone2"),"Dropped!"));
        System.out.println("Ball has entered Dropzone 2");
        driver.close();
    }
}
