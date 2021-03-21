package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;

public class WishList_4_6_Page{

    private WebDriver driver;
    private WebDriverWait wait;
    public List<WebElement> wishListProdList;
    public List<WebElement> addToCartBtns;

    public String wishListPageURL = "http://www.demoshop24.com/index.php?route=account/wishlist";

    public WishList_4_6_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<String> getWishListProdList() {
        wishListProdList = driver.findElements(By.xpath("//td[contains(@class,'text-left')]//a"));
        List<String> wishListProdNamesList = new ArrayList<>();
          for (WebElement prodW: wishListProdList) {
              if (!prodW.getText().isEmpty()) {
                  wishListProdNamesList.add(prodW.getText());
              }
          }
        return wishListProdNamesList;
    }

    public void addDesktopCatProdToCart() throws Exception {
        addToCartBtns = driver.findElements(By.xpath("//button[@data-original-title='Add to Cart']"));
        wait = new WebDriverWait(driver,50000);
        for (WebElement addBtn: addToCartBtns) {
            wait.until(ExpectedConditions.elementToBeClickable(addBtn));
            try {
                addBtn.click();
            }
            catch (Exception ex){

            }
        }
    }

}