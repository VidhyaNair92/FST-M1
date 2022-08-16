package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        WebElement idElement = driver.findElement(By.id("about-link"));
        System.out.println("Text is: " +idElement.getText());
        WebElement classElement = driver.findElement(By.className("green"));
        System.out.println("Text is: " +classElement.getText());
        WebElement linkTextElement = driver.findElement(By.linkText("About Us"));
        System.out.println("Text is: " +linkTextElement.getText());
        WebElement cssElement = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text is: " +cssElement.getText());
        driver.close();


    }
}
