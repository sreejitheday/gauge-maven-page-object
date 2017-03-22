package seleniumFrameWork;

import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.WebDriver;

public class DriverFactory {

    public static WebDriver getDriver() {
        return WebDriverPool.getDriver();
    }

    @BeforeScenario
    public void Setup() {

        String browserName = System.getenv("browser.name");

        WebDriver driver = LocalDriverFactory.createInstance(browserName);
        WebDriverPool.setWebDriver(driver);
    }

    @AfterScenario
    public void TearDown() {

        WebDriver driver = WebDriverPool.getDriver();
        driver.close();
        driver.quit();
    }
}
