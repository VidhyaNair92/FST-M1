package activities;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class Activity13_1 {
    public static void main(String[] args) throws IOException, CsvException {
        CSVReader reader = new CSVReader(new FileReader("src/main/resources/sample.csv"));
        List<String[]> list = reader.readAll();
        System.out.println("No of rows: " + list.size());
        Iterator<String[]> itr = list.iterator();
        while (itr.hasNext()) {
            String[] str = itr.next();
            for(String s:str){
                System.out.print(" " + s);
            }
            System.out.println(" ");
        }
    }
}
