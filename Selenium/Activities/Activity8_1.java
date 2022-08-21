package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Activity8_1 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> columns= driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));
        System.out.println("Number of columns: " +columns.size());
        List<WebElement> rows= driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));
        System.out.println("Number of rows: " +rows.size());
        List<WebElement> thirdRow= driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
        for(WebElement elements: thirdRow){
            System.out.println("Cell value : " +elements.getText());
        }
       String cellValue2_2 = driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]")).getText();
        System.out.println("Cell value in second row and second column is: " +cellValue2_2);
        driver.close();
    }
}
