package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/iframes");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        driver.switchTo().frame(0);
        WebElement firstFrameHeading = driver.findElement(By.xpath("//div[@class='content']"));
        System.out.println("Heading of first frame is: " +firstFrameHeading.getText());
        WebElement firstFrameButton = driver.findElement(By.id("actionButton"));
        System.out.println("Button text is: " +firstFrameButton.getText());
        firstFrameButton.click();
        System.out.println("Button text is: " +firstFrameButton.getText());
        System.out.println("Button color is: " +firstFrameButton.getCssValue("background-color"));
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement secondFrameHeading = driver.findElement(By.xpath("//div[@class='content']"));
        System.out.println("Heading of second frame is: " +secondFrameHeading.getText());
        WebElement secondFrameButton = driver.findElement(By.id("actionButton"));
        System.out.println("Button text is: " +secondFrameButton.getText());
        secondFrameButton.click();
        System.out.println("Button text is: " +secondFrameButton.getText());
        System.out.println("Button color is: " +secondFrameButton.getCssValue("background-color"));
        driver.switchTo().defaultContent();
        driver.close();
    }
}
