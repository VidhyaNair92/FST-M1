package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertTestSteps {
    WebDriver driver;
    WebDriverWait wait;
    Alert alt;

    @Given("^User is on the page$")
    public void userIsOnPage() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @When("^User clicks the Simple Alert button$")
    public void userClicksOnSimpleAlertButton() {
        driver.findElement(By.id("simple")).click();
    }

    @When("^User clicks the Confirm Alert button$")
    public void userClickOnConfirmAlertButton() {
        driver.findElement(By.id("confirm")).click();
    }

    @When("^User clicks the Prompt Alert button$")
    public void userClickOnPromptAlertButton() {
        driver.findElement(By.id("prompt")).click();
    }

    @Then("^Alert opens$")
    public void alertOpens() {
        alt = driver.switchTo().alert();
    }

    @And("^Read the text from it and print it$")
    public void readTextAndPrint() {
        String text = alt.getText();
        System.out.println("Text is: " + text);
    }

    @And("^Write a custom message in it$")
    public void customMessage() {
        alt.sendKeys("Message one");
    }

    @And("^Close the alert$")
    public void closeAlert() {
        alt.accept();
    }

    @And("^Close the alert with Cancel$")
    public void closeAlertWithCancel() {
        alt.dismiss();
    }

    @And("^Close Browser$")
    public void closeBrowser() {
        driver.quit();
    }
}
