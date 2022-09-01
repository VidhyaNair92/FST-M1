package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginTestSteps {
    WebDriver driver;
    WebDriverWait wait;
    @Given("^User is on Login page$")
    public void UserIsOnLoginPage(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @When("^User enters username and password$")
    public void UserEnterUsernameAndPassword(){
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
    @Then("^Read the page title and confirmation message$")
    public void ReadPageTitleAndConfirmationMessage(){
        System.out.println(driver.getTitle());
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(message);
    }
    @And("^close the Browser$")
    public void closeBrowser(){
        driver.quit();
    }

}
