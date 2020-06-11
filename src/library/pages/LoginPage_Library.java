import cucumber.api.java.en.Given;
import static src.data.ProjectConstants.USER;
import static src.data.ProjectConstants.PASSWORD;

public class LoginPage_Library {

    private Logger logger = LogManager.getLogger(this.getClass());
    private LoginPage loginPage;
    private CommonController commonController;

    public LoginPage_Library(CommonController commonController) {
        this.commonController = commonController;
        this.loginPage = commonController.getLoginPage();
    }

    /**
     * Logs in app
     */
    @Given("^LoginPage click on login button$")
    public void LoginPageClickOnLogin() {
        logger.info("LoginPage click on login button");
        loginPage.getUserTextBox().sendKeys(USER);
        loginPage.getPasswordTextBox().sendKeys(PASSWORD);
        commonController.clickOnElement(loginPage.getLogInButton());
    }

}
