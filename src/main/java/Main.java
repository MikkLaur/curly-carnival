import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            driver.get("https://ansokan.bigbank.se/?amount=85000&period=120&interestRate=10.95&lang=sv&bbsource=google&bbchannel=organic");
            driver.findElement(By.cssSelector(".bb-button__icon-after")).click();
            driver.findElement(By.cssSelector(".bb-calculator__result-value"));
        } finally {
            //driver.quit();
        }
    }
}
  