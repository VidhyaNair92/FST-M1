package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        System.out.println("The checkbox is selected " +checkbox.isSelected());
        checkbox.click();
        System.out.println("The checkbox is selected " +checkbox.isSelected());
    }
}
