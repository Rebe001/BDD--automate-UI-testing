import cucumber.api.java.en.When;
import org.apache.logging.log4j.Logger;


public class ResponseConfiguration_Library {

    private Logger logger = LogManager.getLogger(this.getClass());
    private MainPage mainPage;
    private CommonController commonController;

    public MainPage_Library(CommonController commonController) {
        this.commonController = commonController;
        this.mainPage = commonController.getMainPage();
    }

    /**
     * click create demo is performed 
     */
    @When("^MainPage click on create demo button$")
    public void MainPageClickCreateDemo() {
        logger.info("MainPage click on create demo button");
        commonPage.clickOnElement(mainPage.getCreateDemoButton());
    }

}
