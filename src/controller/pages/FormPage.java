import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage {

    @FindBy (id = "user")
    private WebElement user;

    @FindBy (id = "password")
    private WebElement password;

    @FindBy (id = "save")
    private WebElement save;

    @FindBy (id = "message")
    private WebElement message;

    public WebElement getUser(){return user; }

    public WebElement getPassword(){return password;}

    public WebElement getSave(){return save; }

    public WebElement getMessage(){ return message;  }

}
