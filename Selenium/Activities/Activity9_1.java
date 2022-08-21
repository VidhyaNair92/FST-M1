package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-select']"));
        WebElement selectedValue = driver.findElement(By.id("single-value"));
        Select sct = new Select(dropdown);
        sct.selectByVisibleText("Option 2");
        System.out.println("Selected value is : " + selectedValue.getText());
        sct.selectByIndex(3);
        System.out.println("Selected value is : " + selectedValue.getText());
        sct.selectByValue("4");
        System.out.println("Selected value is : " + selectedValue.getText());
        List<WebElement> options = sct.getOptions();
        for(WebElement option:options){
            System.out.println("Dropdown values are : " + option.getText());
        }
        driver.close();
    }
}
