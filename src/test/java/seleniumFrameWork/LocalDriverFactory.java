package seleniumFrameWork;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.InternetExplorerDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LocalDriverFactory {

    static WebDriver createInstance(String browserName) {

        WebDriver driver = null;
        if (browserName.toLowerCase().contains("firefox")) {

            FirefoxDriverManager.getInstance().setup();
            driver = new FirefoxDriver();
            return driver;
        }

        if (browserName.toLowerCase().contains("chrome")) {

            ChromeDriverManager.getInstance().setup();
            driver = new ChromeDriver();
            return driver;
        }

        if(browserName.toLowerCase().equals("ie")) {
            InternetExplorerDriverManager.getInstance().setup();
            driver = new InternetExplorerDriver();
            return driver;
        }
        return driver;
    }
}
