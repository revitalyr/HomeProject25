package tests;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import org.apache.log4j.Logger;

public class TestHome {
    @Test
    public void TestHome() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        Logger log = Logger.getLogger(String.valueOf(getClass()));

        loginPage.openLoginPage();
        //System("dboychuk3107@gmail.com", "123654789");
        loginPage.clickButtonEnter();
        Thread.sleep(9000);
        loginPage.inputEmail("dboychuk3107@gmail.com");
        try {
            Thread.sleep(9000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.inputPassword("123654789");
        loginPage.clickButton2Enter();
        //loginPage.CloseBrower();
    }

}
