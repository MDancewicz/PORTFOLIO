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
    private WebDriver driver;
    WebDriverWait wait;
    Logger logger;

    @Before
    public void setUp()
    {
        logger = Logger.getLogger("TestAutomation");
        WebDriverManager.firefoxdriver().setup();
        //System.setProperty("webdriver.chrome.driver","C:/driver/chromedriver_win32/chromedriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        logger.info("Window maximized");
        driver.get("https://demo.guru99.com/v4/index.php");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.switchTo().frame("gdpr-consent-notice");
        WebElement acceptCookies = driver.findElement(By.xpath("//*[@id='save']/span[1]/div/span"));
        acceptCookies.click();
        driver.switchTo().defaultContent();
    }

    @Test
    public void dummy()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void logInTest()
    {
        WebElement userIdTxt = driver.findElement(By.name("uid"));
        userIdTxt.sendKeys("mngr486342");
    }

    @After
    public void tearDown()
    {
        driver.close();
    }
}