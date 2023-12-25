package selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
        Thread.sleep(2000);
        WebElement element1 = driver.findElement(By.xpath("//div[@id = 'draggable']"));
        WebElement element2 = driver.findElement(By.xpath("//div[@id = 'droppable']"));

        Actions actions1 = new Actions(driver);
        actions1.dragAndDrop(element1,element2);
//        actions1.moveToElement(element1).clickAndHold().moveToElement(element2).release().build().perform();

        Thread.sleep(10000);


//        Actions actions = new Actions(); //класс с действиями
//        actions.moveToElement() //перемещение элемента
//                .keyDown() //нажатие
//                .keyUp() //отпускание
//                .clickAndHold() //зажать левой кнопкой мыши
//                .release() //отпустить зажатие
//                .build() //выстроить эту структуру
//                .perform(); //реализовать



//        element.sendKeys("Java", Keys.ENTER);
//        String ccsValue = element.getCssValue("line-height");
//        System.out.println(ccsValue);

        int i = 0;

        driver.close();
        driver.quit();
    }
}
