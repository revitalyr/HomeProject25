package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends ParentPage {

    By enterButton = By.xpath("//*[@id=\"navbar\"]/div[3]/div[2]/div[1]/a[1]");
    By name = By.id("customers_email");
    By paswordElement = By.id("customers_password");
    By enterButton2 = By.xpath("//*[@id=\"formLogin\"]/div[6]/a");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage() {
        OpenUrl("http://pizzahouse.ua/");
    }
    public void clickButtonEnter() {
        action.ClickToButton(enterButton);
    }

    public void inputEmail(String login) {
        action.InputText(name, login);
        log.trace("login=" + login);
    }

    public void inputPassword(String password) {
        action.InputText(paswordElement, password);
        log.trace("password=" + password);
    }

    public void clickButton2Enter() {
        action.ClickToButton(enterButton2);
    }
//
//    public void System(String login, String password) {
//        action.ClickToButton(enterButton);
//        action.InputText(name, login);
//        action.InputText(paswordElement, password);
//        action.ClickToButton(enterButton2);
//    }
}






