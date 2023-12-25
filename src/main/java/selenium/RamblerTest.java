package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RamblerTest {

    @Test
    public void login (){
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


        driver.get("https://passport.yandex.ru/auth?retpath=https%3A%2F%2Fmail.yandex.ru");


        //driver.switchTo().frame(driver.findElement(By.xpath("//div[@data-id-frame]/iframe")));
        driver.findElement(By.xpath("//input[@class = 'Textinput-Control']")).sendKeys("glukhikh.julia@yandex.ru");
        driver.findElement(By.xpath("//button[@id = 'passp:sign-in']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Andreevna151196@");
        driver.findElement(By.xpath("//button[@id = 'passp:sign-in']")).click();

        driver.quit();
        driver.close();

    }
}
