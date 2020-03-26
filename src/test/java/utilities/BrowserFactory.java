package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    public static WebDriver getDriver(String browser){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
        return new ChromeDriver();
    }
}
