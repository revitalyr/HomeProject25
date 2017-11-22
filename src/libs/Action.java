package libs;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Action {
    WebDriver driver;
    Logger log;

    public Action(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
    }

    public void InputText(By fieldName, String textValue) {
        try {
            WebElement inputElement = driver.findElement(fieldName);
            inputElement.clear();
            inputElement.sendKeys(textValue);
            log.info("'" + textValue + "' Text is inputed");
            //System.out.println("'" + textValue + "' Text is inputed into " + fieldName);
        } catch (Exception e) {
            log.error("Fail" + e);
        }
    }

    public void ClickToButton(By buttonElement) {
        try {
            WebElement button = driver.findElement(buttonElement);
            button.click();
            log.info("Button is cliked");

        } catch (Exception e) {
            log.error("Fail" + e);
        }
    }
}