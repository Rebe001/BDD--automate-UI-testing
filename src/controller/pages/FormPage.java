import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPage {

    @FindBy (id = "product")
    private WebElement product;

    @FindBy (id = "quantity")
    private WebElement quantity;

    @FindBy (id = "save")
    private WebElement save;

    @FindBy (id = "message")
    private WebElement message;

    public WebElement getProduct(){return product; }

    public WebElement getQuantity(){return quantity;}

    public WebElement getSave(){return save; }

    public WebElement getMessage(){ return message;  }

}
