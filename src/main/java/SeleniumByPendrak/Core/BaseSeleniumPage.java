package SeleniumByPendrak.Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

abstract public class BaseSeleniumPage {
    protected static WebDriver driver;

    public BaseSeleniumPage() {
        PageFactory.initElements(driver, this);
    }

    public static void setDriver (WebDriver webDriver){
        driver = webDriver;
    }
}
