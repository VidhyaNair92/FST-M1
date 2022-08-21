package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity8_2 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/tables");
        List<WebElement> columns= driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
        System.out.println("Number of columns: " +columns.size());
        List<WebElement> rows= driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
        System.out.println("Number of rows: " +rows.size());
        String cellValue2_2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Cell value in second row and second column is: " +cellValue2_2);
        driver.findElement(By.xpath("//table[@id='sortableTable']/thead//th[1]")).click();
        String sortingCellValue2_2 = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]")).getText();
        System.out.println("Cell value in second row and second column after sorting is: " +sortingCellValue2_2);
        List<WebElement> footerCellValue= driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot//th"));
        for(WebElement cellValue: footerCellValue) {
            System.out.println("Cell value : " + cellValue.getText());
        }
        driver.close();
    }
}
