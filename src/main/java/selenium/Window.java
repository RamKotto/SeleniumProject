package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Window {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(10000);;

        String window1 = driver.getWindowHandle();

        js.executeScript("window.open()");

        Set<String> currentWindows = driver.getWindowHandles();

        String window2 = null;

        for (String window: currentWindows){
            if (!window.equals(window1)){
                window2 = window;
                break;
            }
        }

        driver.switchTo().window(window2);
        driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.close();
        driver.switchTo().window(window1);



    }
}
