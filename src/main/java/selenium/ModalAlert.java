package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModalAlert {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(10000);

//        WebElement element1 = driver.findElement(By.id());
//        WebElement element2 = driver.findElement(By.id());
//        WebElement element3 = driver.findElement(By.id());
//
//        element1.click();
//
//        Alert alert = (Alert) wait1.until(alertIsPresent());
//       alert.accept();





    }
}
