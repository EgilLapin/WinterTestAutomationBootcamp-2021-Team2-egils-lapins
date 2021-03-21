package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class MP3PlayersCat_4_6_Page {
    private WebDriver driver;
    private WebDriverWait wait;
    public List<WebElement> mp3PlayersCatProdBtns;

    public String mp3PlayersCategoryPageURL = "http://www.demoshop24.com/index.php?route=product/category&path=34";

    public MP3PlayersCat_4_6_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addMP3PlayersCatProdToWishList()  {
        mp3PlayersCatProdBtns = driver.findElements(By.xpath("//button[@data-original-title='Add to Wish List']"));
        wait = new WebDriverWait(driver,15000);
        for (WebElement prodBtn: mp3PlayersCatProdBtns) {
            wait.until(ExpectedConditions.elementToBeClickable(prodBtn));
            try {
                prodBtn.click();
            } catch (Exception ex) {
            }

        }
    }

}
