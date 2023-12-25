package SeleniumByPendrak;

import SeleniumByPendrak.Core.BaseSeleniumTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class SteamTests extends BaseSeleniumTest {

    @Before
    public void init(){
        driver.get("https://store.steampowered.com/");
    }

    @Test
    public void searchTest (){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='term']")))
                .sendKeys("Max Payne");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='store_search_link']/img"))).click();
        int i = 0;

        List<WebElement> titles = wait
                .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@class='title']")));

        assertTrue("В коллекции менее 5 элементов", titles.size()>5);

    }




}
