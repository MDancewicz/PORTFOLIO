import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class Guru99TestApp {
    private WebDriver driver = new FirefoxDriver();
    WebDriverWait wait;
    Logger logger;
    String login = "mngr495648";
    String password = "anyzata";

    @Before
    public void setUp() {
        logger = Logger.getLogger("TestAutomation");
        WebDriverManager.firefoxdriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        logger.info("Window maximized");
        driver.get("https://demo.guru99.com/v4/index.php");
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.switchTo().frame("gdpr-consent-notice");
        WebElement acceptCookies = driver.findElement(By.xpath("//*[@id='save']/span[1]/div/span"));
        acceptCookies.click();
        driver.switchTo().defaultContent();
    }

    public void logIn(String userId, String pswd, Boolean isLoginCorrect, Boolean isPswdCorrect) {
        WebElement userIdTxt = driver.findElement(By.name("uid"));
        userIdTxt.sendKeys(userId);
        WebElement pswdTxt = driver.findElement(By.name("password"));
        pswdTxt.sendKeys(pswd);
        WebElement logInBtn = driver.findElement(By.name("btnLogin"));
        logInBtn.click();
        if (isLoginCorrect && isPswdCorrect) {
            WebElement welcomeMsg = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
            Assert.assertEquals("Manger Id : " + userId, welcomeMsg.getText());
        } else {
            driver.switchTo().alert().accept();
            logInBtn = driver.findElement(By.name("btnLogin"));
            Assert.assertTrue(logInBtn.isDisplayed());
        }
    }

    @Test
    public void logInCorrect() {
        logIn(login, password, true, true);
    }

    @Test
    public void logInIncorrect1() {
        logIn(login, "wrong", true, false);
    }

    @Test
    public void logInIncorrect2() {
        logIn("wrong", password, false, true);
    }

    @Test
    public void logInIncorrect3() {
        logIn("wrong", "wrong", false, false);
    }

    @Test
    public void addNewcustomer() throws InterruptedException {
        logIn(login, password, true, true);
        WebElement newCustomerBtn = driver.findElement(By.linkText("New Customer"));
        newCustomerBtn.click();
        WebElement customerName = driver.findElement(By.name("name"));
        customerName.sendKeys("name");
        WebElement femaleBtn = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]"));
        femaleBtn.click();
        WebElement dateBirth = driver.findElement(By.name("dob"));
        dateBirth.sendKeys("10.10.2000");
        WebElement newAdress = driver.findElement(By.name("addr"));
        newAdress.sendKeys("address");
        WebElement newCity = driver.findElement(By.name("city"));
        newCity.sendKeys("city");
        WebElement newState = driver.findElement(By.name("state"));
        newState.sendKeys("state");
        WebElement newPin = driver.findElement(By.name("pinno"));
        newPin.sendKeys("123456");
        WebElement newMobileNumber = driver.findElement(By.name("telephoneno"));
        newMobileNumber.sendKeys("111111111");
        WebElement newEmail = driver.findElement(By.name("emailid"));
        newEmail.sendKeys("name@new.com");
        WebElement newPassword = driver.findElement(By.name("password"));
        newPassword.sendKeys("1234");
        WebElement submit = driver.findElement(By.name("sub"));
        submit.click();
    }

//    @After
//    public void tearDown() {
//        driver.close();
//    }
}