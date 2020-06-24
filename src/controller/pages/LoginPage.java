import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "username")
    private WebElement userTextBox;

    @FindBy(id = "password")
    private WebElement passwordTextBox;

    @FindBy(xpath = "//input[@id = 'login']")
    private WebElement logInButton;


    public WebElement getUserTextBox() {
        return userTextBox;
    }

    public WebElement getPasswordTextBox() {
        return passwordTextBox;
    }


    public WebElement getLogInButton() {
        return logInButton;
    }

}
