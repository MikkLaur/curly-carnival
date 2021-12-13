import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    WebDriver driver;

    void waitForLoading(long millis) {
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(millis));
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://ansokan.bigbank.se/?amount=85000&period=120&interestRate=10.95&lang=sv&bbsource=google&bbchannel=organic");
    }

    @org.junit.jupiter.api.Test
    void DefaultValues() throws InterruptedException {
        driver.findElement(By.cssSelector(".bb-button__icon-after")).click();
        WebElement el = driver.findElement(By.cssSelector(".bb-calculator__result-value"));
        waitForLoading(500);
        assertEquals("1210,73 SEK", el.getText());
        driver.findElement(By.cssSelector("#header-calculator-amount .svg3599908832__a")).click();
        driver.findElement(By.cssSelector("#header-calculator-amount .bb-currency-input__input")).sendKeys("85000");
        //WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromMilliseconds(500));
        waitForLoading(500);


    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        //driver.quit();
    }
}