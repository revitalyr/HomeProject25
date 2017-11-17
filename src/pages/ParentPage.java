package pages;

import libs.Action;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


public class ParentPage {
    WebDriver driver;
    Logger log;
    Action action;

    public ParentPage(WebDriver driver) {
        this.driver = driver;
        log = Logger.getLogger(getClass());
        action = new Action(driver);
    }

    public void OpenUrl (String url) {
        try {

            driver.get(url);
            log.info("Url is opened");
        }
        catch (Exception e){
            log.error("Fail" +e);
        }
    }
    public void CloseBrower() {
        try {
            driver.quit();
            log.info("Brower is close");
        } catch (Exception e)
        {
            log.error("Fail" + e);
        }
    }

}
