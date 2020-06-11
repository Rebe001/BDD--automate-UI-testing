import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {

    @FindBy(xpath = "//input[@id = 'create-demo']")
    private WebElement createDemoButton;

    public WebElement getCreateDemoButton() {
        return createDemoButton;
    }

}
