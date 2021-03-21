package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class TabletsCat_4_6_Page {
    private WebDriver driver;
    private WebDriverWait wait;

    public List<WebElement> tabletsCatProdBtns;

    public String tabletsCategoryPageURL = "http://www.demoshop24.com/index.php?route=product/category&path=57";

    public TabletsCat_4_6_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addTabletsCatProdToWishList()  {
        tabletsCatProdBtns = driver.findElements(By.xpath("//button[@data-original-title='Add to Wish List']"));
        wait = new WebDriverWait(driver,15000);
        for (WebElement prodBtn: tabletsCatProdBtns) {
            wait.until(ExpectedConditions.elementToBeClickable(prodBtn));
            try {
                prodBtn.click();
            } catch (Exception ex) {
            }
        }
    }
}
