import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs {
    WebDriver webDriver;

    @Before
    public void iOpenBrowser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Informatyka\\WebDrivers\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @After
    public void closeBrowser() {
        webDriver.quit();
    }

    @Given("I am to website")
    public void iAmToWebsite() {
        webDriver.get("https://the-internet.herokuapp.com/login");
    }

    @When("I type {string} as login")
    public void iTypeAsLogin(String login) {
        webDriver.findElement(By.cssSelector("input[name=username]")).sendKeys(login);
    }

    @And("I type {string} as password")
    public void iTypeAsPassword(String password) {
        webDriver.findElement(By.cssSelector("input[name=password]")).sendKeys(password);
    }

    @And("I press login button")
    public void iPressLoginButton() {
        webDriver.findElement(By.cssSelector("button")).click();
    }

    @Then("I am logged in")
    public void iAmLoggedIn() {
        String eksceptedText = "You logged into a secure area!";
        String readText = webDriver.findElement(By.cssSelector("div#flash")).getText();
        Assert.assertTrue(readText.contains(eksceptedText));
    }

    @Then("I am not logged in 1")
    public void iAmNotLoggedIn() {
        String eksceptedText = "Your password is invalid!";
        String readText = webDriver.findElement(By.cssSelector("div#flash")).getText();
        Assert.assertTrue(readText.contains(eksceptedText));
    }

    @Then("I am not logged in 2")
    public void iAmNotLoggedIn2() {
        String eksceptedText = "Your username is invalid!";
        String readText = webDriver.findElement(By.cssSelector("div#flash")).getText();
        Assert.assertTrue(readText.contains(eksceptedText));
    }
}