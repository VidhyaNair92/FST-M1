package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/nested-iframes");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        driver.switchTo().frame(0);
        driver.switchTo().frame(0);
        WebElement firstFrameHeading = driver.findElement(By.xpath("//div[@class='content']"));
        System.out.println("Heading of first frame is: " +firstFrameHeading.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        WebElement secondFrameHeading = driver.findElement(By.xpath("//div[@class='content']"));
        System.out.println("Heading of second frame is: " +secondFrameHeading.getText());
        driver.switchTo().defaultContent();
        driver.close();
    }
}
