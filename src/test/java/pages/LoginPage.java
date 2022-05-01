package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import static utils.CommonMethods.driver;

public class LoginPage extends CommonMethods {

    @FindBy(id = "input-username")
    public WebElement usernameBox;

    @FindBy(id = "input-password")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type = 'submit']")
    public WebElement loginBtn;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
}
