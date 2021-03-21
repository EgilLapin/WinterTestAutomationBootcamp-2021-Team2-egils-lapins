package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

import java.net.MalformedURLException;
import java.util.List;

public class WishList_4_6_Steps {

    Login_4_6_Page pagePO;
    DesktopCat_4_6_Page cat1PO;
    TabletsCat_4_6_Page cat2PO;
    PhonesCat_4_6_Page cat3PO;
    MP3PlayersCat_4_6_Page cat4PO;
    WishList_4_6_Page wishPO;
    Cart_4_6_Page cartPO;
    List<String> wishListProdNamesList;
    List<String> cartProdNamesList;
    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";
    private String arg1;
    private String arg2;

    @Before
    public void openBrowser() throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver89.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        pagePO = PageFactory.initElements(this.driver, Login_4_6_Page.class);
        cat1PO = PageFactory.initElements(this.driver, DesktopCat_4_6_Page.class);
        cat2PO = PageFactory.initElements(this.driver, TabletsCat_4_6_Page.class);
        cat3PO = PageFactory.initElements(this.driver, PhonesCat_4_6_Page.class);
        cat4PO = PageFactory.initElements(this.driver, MP3PlayersCat_4_6_Page.class);
        wishPO = PageFactory.initElements(this.driver, WishList_4_6_Page.class);
        cartPO = PageFactory.initElements(this.driver, Cart_4_6_Page.class);
    }

    @After
    public void embedScreenshot(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
        }
        Thread.sleep(2500);
        driver.quit();
    }

    @Given("^I am on Login page$")
    public void i_am_on_Login_page() throws Throwable {
        driver.get(pagePO.loginPageURL);
    }

    @When("^enter EMail \"([^\"]*)\"$")
    public void enter_EMail(String arg1) {
        this.arg1 = arg1;
        pagePO.enter_EMail("TaigaMaiga@inbox.lv");
    }

    @When("^enter password \"([^\"]*)\"$")
    public void enter_Password(String arg2) throws Throwable {
        this.arg2 = arg2;
        pagePO.enter_Password("1MazaMeitene");
    }

    @Given("^navigate to Desktop_Mac Category page$")
    public void navigate_to_Desktop_Mac_Category_page() throws Throwable {
        driver.get(cat1PO.desktopCategoryPageURL);
    }

    @Given("^navigate to Tablets Category page$")
    public void navigate_to_Tablets_Category_page() throws Throwable {
        driver.get(cat2PO.tabletsCategoryPageURL);
    }

    @Given("^navigate to Phones Category page$")
    public void navigate_to_Phones_Category_page() throws Throwable {
        driver.get(cat3PO.phonesCategoryPageURL);
    }

    @Given("^navigate to MP(\\d+)Players Category page$")
    public void navigate_to_MP3_Players_Category_page(int arg1) throws Throwable {
        driver.get(cat4PO.mp3PlayersCategoryPageURL);
    }

    @When("^add to Wish List a Desktop Category product$")
    public void add_to_Wish_List_a_Desktop_Category_product() throws Throwable {
        cat1PO.addDesktopCatProdToWishList();
    }

    @When("^add to Wish List a Tablets Category product$")
    public void add_to_Wish_List_a_Tablets_Category_product() throws Throwable {
        cat2PO.addTabletsCatProdToWishList();
    }

    @When("^add to Wish List a Phones Category product$")
    public void add_to_Wish_List_a_Phones_Category_product() throws Throwable {
        cat3PO.addPhonesCatProdToWishList();
    }

    @When("^add to Wish List MP(\\d+)Players Category product$")
    public void add_to_Wish_List_MP_Players_Category_product(int arg1) throws Throwable {
        cat4PO.addMP3PlayersCatProdToWishList();
    }

    @Given("^navigate to Wish List page with products added$")
    public void navigate_to_Wish_List_page_with_objects_added() throws Throwable {
        driver.get(wishPO.wishListPageURL);
        wishListProdNamesList = wishPO.getWishListProdList();
    }

    @Given("^click on Add to Cart button$")
    public void click_on_Add_to_Cart_button() throws Throwable {
        wishPO.addDesktopCatProdToCart();
    }

    @Then("^navigate to Cart page with products added$")
    public void navigate_to_Cart_page_with_products_added() throws Throwable {
        driver.get(cartPO.cartPageURL);
        cartProdNamesList = cartPO.getCartProdList();
    }

    @Then("^check if Desktop Category product is added to Cart$")
    public void check_if_Desktop_Category_product_is_added_to_Cart() throws Throwable {
        Assert.assertTrue(wishListProdNamesList.equals(cartProdNamesList));

    }

    @Then("^check if Tablets Category product is added to Cart$")
    public void check_if_Tablets_Category_product_is_added_to_Cart() throws Throwable {
        Assert.assertTrue(wishListProdNamesList.equals(cartProdNamesList));

    }

    @Then("^check if Phones Category product is added to Cart$")
    public void check_if_Phones_Category_product_is_added_to_Cart() throws Throwable {
        Assert.assertTrue(wishListProdNamesList.equals(cartProdNamesList));
    }

    @Then("^check if MP(\\d+)Players Category product is added to Cart$")
    public void check_if_MP_Players_Category_product_is_added_to_Cart(int arg1) throws Throwable {
        Assert.assertTrue(wishListProdNamesList.equals(cartProdNamesList));
    }

}
