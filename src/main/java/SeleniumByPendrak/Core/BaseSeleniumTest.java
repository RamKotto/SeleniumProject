package SeleniumByPendrak.Core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

abstract public class BaseSeleniumTest {
    protected WebDriver driver;
    protected WebDriverWait wait;

@Before
    public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    BaseSeleniumPage.setDriver(driver);
    }

    @After
    public void tearDown(){
    driver.close(); //закрывает хромдрайвер
    driver.quit(); //закрывает хром
    }

}
