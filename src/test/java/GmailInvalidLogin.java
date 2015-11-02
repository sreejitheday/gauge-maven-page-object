import com.Pages.GmailLoginPage;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.WebDriver;
import seleniumFrameWork.DriverFactory;

/**
 * Created by Sreejith on 1/11/2015.
 */
public class GmailInvalidLogin {

    private WebDriver driver;
    GmailLoginPage gmailLoginPage = new GmailLoginPage();;

    public GmailInvalidLogin() {

        driver = DriverFactory.getDriver();
    }

    @Step("Given I am on <url> page")
    public void navigateToPage(String url) {
        driver.get(url);
    }

    @Step("Then I enter the user name as <userName>")
    public void enterUserName(String userName) {

        gmailLoginPage.setUserNameTextFiled(userName);
    }

    @Step("And click Next button")
    public void enterPassword() {
        gmailLoginPage.clickNextButton();
    }

    @Step("Then I enter the password as <password>")
    public void enterPassword(String password) throws InterruptedException {
        gmailLoginPage.setPasswordTextField(password);
    }

    @Step("And click on Login button")
    public void clickOnLoginButton() {
        gmailLoginPage.clickLoginButton();
    }

    @Step("Then I should see the error message")
    public void verifyTheLoginFailedMessage() {

    }
}
