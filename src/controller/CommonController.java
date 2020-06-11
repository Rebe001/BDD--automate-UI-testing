import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;


public class CommonController{

    /**Pages**/
    public LoginPage getLoginPage() { return PageFactory.initElements(getDriver(), LoginPage.class); }
    public MainPage getMainPage() { return PageFactory.initElements(getDriver(), MainPage.class); }
    public DemoPage getDemoPage() { return PageFactory.initElements(getDriver(), DemoPage.class); }

    private void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }
    /**
     * This method clicks on a given element
     * @param element: element to click
     */
    public void clickOnElement(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

}

