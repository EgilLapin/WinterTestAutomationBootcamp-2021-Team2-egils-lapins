package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.EgilsPage;

import java.util.List;

public class EgilsWishListSteps {

    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\";
    EgilsPage MainPO;

    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver88.exe");
        driver = new ChromeDriver();
        //System.setProperty("webdriver.ie.driver", libWithDriversLocation + "IEDriverServer.exe");
        //driver = new InternetExplorerDriver();

        driver.manage().deleteAllCookies();
        MainPO = PageFactory.initElements(driver, EgilsPage.class);
    }

    @Given("^Logged in user opens Webpage$")
    public void logged_in_user_opens_Webpage() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?");
        MainPO.clickDropdown();
        MainPO.clickLoginButton();
        MainPO.enterPassword();
        MainPO.enterEmail();
        MainPO.clickLogin();
        driver.get("http://www.demoshop24.com/index.php?");
        Thread.sleep(1000);

    }

    @Then("^WishList Icon is seen$")
    public void wishlist_is_seen() throws Throwable {
        Assert.assertTrue(MainPO.upperWishlistIconIsShown());
    }

    @When("^User Navigates to Components and Monitors Lists Page$")
    public void user_Navigates_to_Components_and_Monitors_Lists_Page() throws Throwable {
        MainPO.selectCategory("Components", "Monitors");
    }

    @When("^User Navigates to Desktops and Mac Lists Page$")
    public void user_Navigates_to_Desktops_and_Mac_Lists_Page() throws Throwable {
        MainPO.selectCategory("Desktops", "Mac");
    }

    @When("^User Navigates to Tablets and - Lists Page$")
    public void user_Navigates_to_Tablets_and_Lists_Page() throws Throwable {
        MainPO.selectCategory("Tablets", "");
    }

    @When("^User Navigates to Cameras and - Lists Page$")
    public void user_Navigates_to_Cameras_and_Lists_Page() throws Throwable {
        MainPO.selectCategory("Cameras", "");
    }

    @When("^User Navigates to Phones and - Lists Page$")
    public void user_Navigates_to_Phones_and_Lists_Page() throws Throwable {
        MainPO.selectCategory("Phones", "");
    }

    @When("^User Navigates to MP(\\d+) Players and test (\\d+) Lists Page$")
    public void user_Navigates_to_MP_Players_and_test_Lists_Page(int arg1, int arg2) throws Throwable {
        MainPO.selectCategory("MP3", "test 18 ");
    }

    @When("^User Navigates to Software and - Lists Page$")
    public void user_Navigates_to_Software_and_Lists_Page() throws Throwable {
        MainPO.selectCategory("Software", "");
    }

    @When("^User Navigates to Laptops and Mac Lists Page$")
    public void user_Navigates_to_Laptops_and_Mac_Lists_Page() throws Throwable {
        MainPO.selectCategory("Laptops", "Mac");
    }

    @When("^user opens product page$")
    public void user_opens_product_page() throws Throwable {
        MainPO.getProduct();
    }

    @When("^user clicks Add to Wishlist icon$")
    public void user_clicks_Add_to_Wishlist_icon() throws Throwable {
        MainPO.addToWishlist();
        Thread.sleep(500);
    }

    @Then("^item gets added to wishlist$")
    public void item_gets_added_to_wishlist() throws Throwable {
        Assert.assertTrue(MainPO.checkSuccessMsg());
    }

    @When("^User opens Wishlist$")
    public void user_opens_Wishlist() throws Throwable {
        MainPO.clickWishListBtn();
        Thread.sleep(750);
    }

    @Then("^Items added are displayed$")
    public void items_added_are_displayed() throws Throwable {
        List products = driver.findElements(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr"));
        System.out.println("Count of Items in Wish list: " + products.size());
    }

    @When("^User clicks on Remove button$")
    public void user_clicks_on_Remove_button() throws Throwable {
        MainPO.clickRemoveBtn();
        Thread.sleep(500);
    }

    @Then("^Item is removed from Wish List$")
    public void item_is_removed_from_Wish_List_y() throws Throwable {
        Assert.assertTrue(MainPO.checkRemoveAlert());
    }

    @When("^User click on Add to Cart button$")
    public void user_click_on_Add_to_Cart_button() throws Throwable {
        MainPO.clickAddCartBtn();
        Thread.sleep(1000);
    }

    @Then("^Item is added to Cart$")
    public void item_is_added_to_Cart() throws Throwable {
        Assert.assertTrue(MainPO.checkAddedCartAlert());
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.manage().deleteAllCookies();
        driver.quit();
    }


}
