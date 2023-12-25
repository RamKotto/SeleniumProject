import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://dev.by/");

        WebElement element = driver.findElement(By.xpath("(//a[text() = 'Вход']"));
        String par = element.getCssValue("transition");
        System.out.println(par);




//        driver.get("https://www.google.com/");
//
//        WebElement input = driver.findElement(By.xpath("//textarea[@aria-label='Найти']")); //нахождение элемента
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //неявное ожидание
//
//        WebElement element =(new WebDriverWait(driver,Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfElementLocated(By.id("123")))); //явное ожидание
//
////        element = input.click();
//        int i = 0;


//        driver.close();
//        driver.quit();


    }
}
