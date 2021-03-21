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
import pageObjects.Login4and5;
import pageObjects.Page;

public class WishList4and5 extends GeneralSteps{

    Login4and5 pagePO;
    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";
    Page MainPO;
    private String arg1;
    private String arg2;

    @Before
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        pagePO = PageFactory.initElements(this.driver, Login4and5.class);
        //MainPO = PageFactory.initElements(driver, Page.class);
    }

    @Given("^I am on Login page$")
    public void i_am_on_Login_page() throws Throwable {
        driver.get(pagePO.loginPageURL);
    }

    @When("^enter EMail \"([^\"]*)\"$")
    public void enter_EMail(String arg1) throws Throwable {
        this.arg1 = arg1;
        pagePO.enter_EMail("natserga@gmail.com");
    }

    @When("^enter password \"([^\"]*)\"$")
    public void enter_password(String arg1) throws Throwable {
        this.arg2 = arg2;
        pagePO.enter_Password("060310Tt");
    }


    @Given("^User opens Webpage$")
    public void user_opens_Webpage() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=common/home");

    }

    @When("^User clicks on any part category from Product menu$")
    public void user_clicks_on_any_part_category_from_Product_menu() throws Throwable {
        driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();

    }

    @When("^User clicks on one product from Product page$")
    public void user_clicks_on_one_product_from_Product_page() throws Throwable {
        driver.findElement(By.cssSelector("a[href='http://www.demoshop24.com/index.php?route=product/category&path=25_28']")).click();
    }

    @When("^User click on product heart icon$")
    public void user_click_on_product_heart_icon() throws Throwable {
        driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List'][1]")).click();
    }

    @When("^User navigates to Wish List icon$")
    public void user_navigates_to_Wish_List_icon() throws Throwable {
        driver.findElement(By.id("wishlist-total")).click();

    }

    @When("^User clicks on \"([^\"]*)\" button$")
    public void user_clicks_on_button(String arg1) throws Throwable {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@data-original-title='Remove']")).click();
    }

    @Then("^Item is removed from Wish List$")
    public void item_is_removed_from_Wish_List() throws Throwable {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed());
    }


    @After
    public void closeBrowser() {
        driver.quit();
    }

}