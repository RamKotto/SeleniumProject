package SeleniumByPendrak.HelpDesk;

import SeleniumByPendrak.Core.BaseSeleniumTest;
import org.junit.Test;

public class HelpDeskTest extends BaseSeleniumTest {

    @Test
    public void checkTicket(){

        String title = "Yuliya Glukhikh";
        String body = "Сообщение в техподдержку с помощью селениума";
        String email = "gl@yandex.ru";
        MainPage mainPage = new MainPage();
        mainPage.createTicket(title,body,email);
        

    }
}
