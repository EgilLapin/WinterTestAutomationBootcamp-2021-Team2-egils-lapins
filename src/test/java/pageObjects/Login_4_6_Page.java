package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_4_6_Page{

    private WebDriver driver;
    @FindBy(how = How.ID, using = "input-email")
    public WebElement emailField;
    @FindBy(how = How.ID, using = "input-password")
    public WebElement passwordField;
    @FindBy(how = How.XPATH, using = "//input[@value='Login']")
    public WebElement loginButton;

    public String loginPageURL = "http://www.demoshop24.com/index.php?route=account/login";

    public Login_4_6_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enter_EMail(String arg1) {
        emailField.sendKeys(arg1);
    }

    public void enter_Password(String arg2) {
        passwordField.sendKeys(arg2);
        emailField.sendKeys(Keys.ENTER);
    }

}