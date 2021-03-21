package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;
import java.util.List;

public class Cart_4_6_Page {

    private WebDriver driver;
    private WebDriverWait wait;
    public List<WebElement> cartProdList;

    public String cartPageURL = "http://www.demoshop24.com/index.php?route=checkout/cart";

    public Cart_4_6_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<String> getCartProdList() {
        cartProdList = driver.findElements(By.xpath("//td[contains(@class,'text-left')]//a"));
        wait = new WebDriverWait(driver,50000);
        List<String> cartProdNamesList = new ArrayList<>();
            for (WebElement prodC: cartProdList) {
                if (!prodC.getText().isEmpty()) {
                    cartProdNamesList.add(prodC.getText());
                }
            }
        return cartProdNamesList;
    }

}