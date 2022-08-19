package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        WebElement textbox = driver.findElement(By.id("input-text"));
        System.out.println("The textbox is enabled " +textbox.isEnabled());
        WebElement enableInputButton = driver.findElement(By.id("toggleInput"));
        enableInputButton.click();
        System.out.println("The textbox is enabled " +textbox.isEnabled());
    }
}
