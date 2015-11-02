import com.thoughtworks.gauge.Step;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import seleniumFrameWork.DriverFactory;

/**
 * Created by Sreejith on 1/11/2015.
 */
public class VerifyPGHomePage {

    private final WebDriver driver;

    public VerifyPGHomePage() {

        this.driver = DriverFactory.getDriver();
    }

    @Step("Open PG Site")
    public void nagivateToHomePage() {

        driver.get("http://www.propertyguru.com.sg");
    }

    @Step("Verify the page title")
    public void verifyPGHomePageTitle() {

        System.out.println("Reached here");
        Assert.assertTrue("Title is not expected.",
                driver.getTitle().equals("Singapore Property, Property for Sale/Rent, Singapore Real Estate | PropertyGuru"));
    }

}
