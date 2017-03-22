package seleniumFrameWork;

import org.openqa.selenium.WebDriver;

/**
 * Created by sreejith on 22/3/17.
 */
public class WebDriverPool {

    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {
        return webDriver.get();
    }

    static void setWebDriver(WebDriver driver) {
        webDriver.set(driver);
    }
}
