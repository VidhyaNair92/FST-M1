package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/target-practice");
        String title = driver.getTitle();
        System.out.println("Title of the page is: " +title);
        String thirdHeader = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("Third header text is " +thirdHeader);
        String fifthHeaderColour = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("Fifth header color is " +fifthHeaderColour);
        String classAttributeValues =  driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
        System.out.println("Class attribute values are " +classAttributeValues);
        String greyButton =  driver.findElement(By.xpath(" //html/body/div/div/div/div/div/div/div/div/div[3]/button[2]")).getText();
        System.out.println("Grey colour button text is " +greyButton);


    }
}
