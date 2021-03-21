package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class DesktopCat_4_6_Page{

    private WebDriver driver;
    private WebDriverWait wait;
    public List<WebElement> desktopCatProdBtns;

    public String desktopCategoryPageURL = "http://www.demoshop24.com/index.php?route=product/category&path=20_27";

    public DesktopCat_4_6_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addDesktopCatProdToWishList()  {
        desktopCatProdBtns = driver.findElements(By.xpath("//button[@data-original-title='Add to Wish List']"));
        wait = new WebDriverWait(driver,15000);
            for (WebElement prodBtn: desktopCatProdBtns) {
                wait.until(ExpectedConditions.elementToBeClickable(prodBtn));
                try {
                    prodBtn.click();
                } catch (Exception ex) {
                }
            }
    }
}