import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import static src.data.ProjectConstants.MESSAGE;


public class FormPage_Library {

    private Logger logger = LogManager.getLogger(this.getClass());
    private FormPage formPage;
    private CommonController commonController;

    public FormPage_Library(CommonController commonController) {
        this.commonController = commonController;
        this.formPage = commonController.getFormPage();
    }

    /**
     * Set user to desired value
     * @param user
     */
    @When("^FormPage set user to \"([^\"]*)\"$")
    public void FormPageSetUserTo(String user) {
        logger.info("FormPage set user to {}", user);
        formPage.getUser().clear();
        formPage.getUser().sendKeys(user);
    }

    /**
     * Set password to desired value
     * @param password
     */
    @When("^FormPage set password to \"([^\"]*)\"$")
    public void FormPageSetPasswordTo(String password) {
        logger.info("FormPage set password to {}", password);
        formPage.getPassword().clear();
        formPage.getPassword().sendKeys(password);
    }

  /**
     * Set password to desired value
     * @param password
     */
    @When("^FormPage click on save button$")
    public void FormPageClickOnSaveButton() {
        logger.info("FormPage click on save button");
        commonPage.clickOnElement(formPage.getSave());
    }

    /**
     * Verify FormPage success message is displayed
     */
    @Then("^Verify FormPage success message is displayed$")
    public void VerifyInvalidValueInProject() {
        logger.info("Verify FormPage success message is displayed");
        Assert.assertTrue("success message not displayed", formPage.getMessage().isDisplayed());
        Assert.assertEquals("success message is correct", formPage.getMessage().getText(), MESSAGE);
    }

}
