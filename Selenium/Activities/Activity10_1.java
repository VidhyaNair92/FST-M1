package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity10_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/input-events");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        WebElement cubeElement = driver.findElement(By.xpath("//div[@id='wrapD3Cube']"));
        WebElement cubeValue = driver.findElement(By.className("active"));
        Actions actions = new Actions(driver);
        actions.click(cubeElement).build().perform();
        cubeValue = driver.findElement(By.className("active"));
        System.out.println("Performed left click " +cubeValue.getText());
        actions.doubleClick(cubeElement).build().perform();
        cubeValue = driver.findElement(By.className("active"));
        System.out.println("Performed double click " +cubeValue.getText());
        actions.contextClick(cubeElement).build().perform();
        cubeValue = driver.findElement(By.className("active"));
        System.out.println("Performed right click " +cubeValue.getText());
        driver.close();
    }
}
