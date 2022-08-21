package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity9_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        WebElement selectedValue = driver.findElement(By.id("multi-value"));
        WebElement multiSelectDropdown = driver.findElement(By.id("multi-select"));
        Select sct = new Select(multiSelectDropdown);
        Boolean status = sct.isMultiple();
        if(status){
            System.out.println("Dropdown is multiselect");
        }
        else{
            System.out.println("Dropdown is not multiselect");
        }
        sct.selectByVisibleText("Javascript");
        System.out.println("Selected value is : " + selectedValue.getText());
        sct.selectByValue("node");
        System.out.println("Selected value is : " + selectedValue.getText());
        for(int i= 4;i<=6;i++){
            sct.selectByIndex(i);
        }
        System.out.println("Selected value is : " + selectedValue.getText());
        sct.deselectByValue("node");
        sct.deselectByIndex(7);
        System.out.println("First selected option is : " + sct.getFirstSelectedOption().getText());
        List<WebElement> selectedOptions = sct.getAllSelectedOptions();
        for(WebElement option: selectedOptions){
            System.out.println("Selected Options are : " + option.getText());
        }
        sct.deselectAll();
        System.out.println("Selected value is : " + selectedValue.getText());
        driver.close();
    }
}
