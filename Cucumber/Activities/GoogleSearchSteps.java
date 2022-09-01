package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchSteps {
    WebDriver driver;
    WebDriverWait wait;

    @Given("^User is on Google Home Page$")
    public void UserIsOnGooglePage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.google.com");
    }

    @When("^User types in Cheese and hits ENTER$")
    public void UserTypeCheeseAndHitsEnter() {
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.ENTER);
    }
    @Then("^Show how many search results were shown$")
    public void NoOfSearchResultsDisplayed(){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("result-stats")));
        String text = driver.findElement(By.id("result-stats")).getText();
        System.out.println("No of search results "+ text);
    }
    @And("^Close the browser$")
    public void closeBrowser(){
        driver.quit();
    }
}
