package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class EgilsPage {


    @FindBy(how = How.XPATH, using = "//li//a[text()=\"Login\"]")
    public WebElement loginButton;

    @FindBy(how = How.CLASS_NAME, using = "dropdown")
    public WebElement clickDropdown;

    @FindBy(how = How.ID, using = "input-email")
    public WebElement enterEmail;

    @FindBy(how = How.ID, using = "input-password")
    public WebElement enterPassword;

    @FindBy(how = How.XPATH, using = "//input[@value=\"Login\"]")
    public WebElement clickLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\"wishlist-total\"]/i")
    public WebElement upperWishlistIcon;

    @FindBy(how = How.XPATH, using = "//button[@data-original-title='Add to Wish List']")
    public WebElement addToWishlist;

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Success: You have added')]")
    public WebElement successMsg;

    @FindBy(how = How.LINK_TEXT, using = "iPhone")
    public WebElement getProduct;

    @FindBy(how = How.XPATH, using = "//td[contains(text(),'In Stock')]")
    public WebElement itemsDisplayed;

    @FindBy(how = How.XPATH, using = "//a[@class='btn btn-danger']")
    public WebElement removeBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement removeMsg;

    @FindBy(how = How.XPATH, using = "//button[@data-original-title='Add to Cart']")
    public WebElement addCartBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissible']")
    public WebElement addedCartMsg;

    @FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']")
    public WebElement categorySelector;

    @FindBy(how = How.XPATH, using = "//ul[@class='nav navbar-nav']//li[@class='dropdown open']//ul")
    public WebElement subcategorySelector;


    public void clickLoginButton() {
        loginButton.click();
    }

    public void clickDropdown() {
        clickDropdown.click();
    }

    public void enterEmail() {
        enterEmail.sendKeys("egillapin@protonmail.com");
    }

    public void enterPassword() {
        enterPassword.sendKeys("test1234");
    }

    public void clickLogin() {
        clickLogin.click();
    }

    public void addToWishlist() {
        addToWishlist.click();
    }

    public boolean isHeartIconPresent() {
        return addToWishlist.isDisplayed();
    }

    public void getProduct() {
        getProduct.click();
    }

    public boolean checkSuccessMsg() {
        return successMsg.isDisplayed();
    }

    public boolean upperWishlistIconIsShown() {
        return upperWishlistIcon.isDisplayed();
    }

    public void clickWishListBtn() {
        upperWishlistIcon.click();
    }

    public boolean checkItemsDisplayed() {
        return itemsDisplayed.isDisplayed();
    }

    public void clickRemoveBtn() {
        removeBtn.click();
    }

    public boolean checkRemoveAlert() {
        return removeMsg.isDisplayed();
    }

    public void clickAddCartBtn() {
        addCartBtn.click();
    }

    public boolean checkAddedCartAlert() {
        return addedCartMsg.isDisplayed();
    }

    public void selectCategory(String catgName, String subCatgName) {
        try {

            WebElement category = categorySelector;
            List<WebElement> categoryList = category.findElements(By.tagName("li"));

            for (WebElement li : categoryList) {
                if (li.getText().contains(catgName)) {
                    li.click();

                    WebElement subcategory = subcategorySelector;
                    List<WebElement> subcategoryList = subcategory.findElements(By.tagName("li"));

                    for (WebElement li2 : subcategoryList) {
                        if (li2.getText().contains(subCatgName)) {
                            li2.click();
                            break;
                        }
                    }

                }
            }

        } catch (StaleElementReferenceException | NoSuchElementException ex) {
            System.out.println("Making Selenium continue after Exception");
        }
    }


}












