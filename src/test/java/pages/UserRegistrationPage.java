package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class UserRegistrationPage extends CommonMethods {

    @FindBy(linkText = "hidden-xs hidden-sm hidden-md")
    public WebElement myAcctBtn;

    @FindBy(xpath = "dropdown-menu dropdown-menu-right")
    public WebElement registerBtn;

    @FindBy (id = "input-firstname")
    public WebElement firstNameBox;

    @FindBy(id = "input-lastname")
    public WebElement lastNameBox;

    @FindBy(id = "input-email")
    public WebElement emailBox;

    @FindBy(id = "input-telephone")
    public WebElement phoneBox;

    @FindBy(id = "input-password")
    public WebElement passwordBox;

    @FindBy(id = "input-confirm")
    public WebElement passwordConfirmBox;

    @FindBy(xpath = "(//input[@type = 'radio'])[1]")
    public WebElement radioButtnoNo;

    @FindBy(xpath = "//input[@type = 'checkbox']")
    public WebElement checkBox;

    @FindBy(xpath = "//input[@type = 'submit']")
    public WebElement submitBtn;


    public UserRegistrationPage(){
        PageFactory.initElements(driver, this);
    }
}
