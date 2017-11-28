package tests;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import pages.LoginPage;

import org.apache.log4j.Logger;

public class TestHome {
    @Test
    public void TestHome() throws InterruptedException {
        String driver_path = System.getenv("WEB_DRIVER_BIN_PATH");

        if((driver_path==null) || driver_path.isEmpty())
            throw new IllegalArgumentException("You have to define the environment variable WEB_DRIVER_BIN_PATH -> Run.EditConfigurations...->Environment Variables (instead of use System.setProperty(...))");

        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, driver_path);

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
