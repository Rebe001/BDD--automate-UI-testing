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
    @When("^FormPage set product to \"([^\"]*)\"$")
    public void FormPageSetProductTo(String product) {
        logger.info("FormPage set product to {}", product);
        formPage.getProduct().clear();
        formPage.getProduct().sendKeys(product);
    }

    /**
     * Set password to desired value
     * @param password
     */
    @When("^FormPage set quantity to \"([^\"]*)\"$")
    public void FormPageSetQuantityTo(String quantity) {
        logger.info("FormPage set quantity to {}", quantity);
        formPage.getQuantity().clear();
        formPage.getQuantity().sendKeys(password);
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
