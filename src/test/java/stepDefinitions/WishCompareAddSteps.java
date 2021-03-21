package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pageObjects.Page;

public class WishCompareAddSteps {

    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";

  Page MainPO;

    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriverusr");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().implicitWait(10, TimeUnit.SECONDS);
        MainPO = PageFactory.initElements(driver,Page.class);
    }

    @Given("^User navigate to home page and log in$")
    public void User_navigate_to_home_page_and_log_in() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=common/home");
        MainPO.clickDropdown();
        MainPO.clickLoginButton();
        MainPO.enterEmail();
        MainPO.enterPassword();
        MainPO.clickLogin();
        Thread.sleep(500);
        driver.get("http://www.demoshop24.com/index.php?route=common/home");
    }

    @Then ("^Users hover over Desktop dropdown$")
    public void User_hover_over_Desktop_dropdown() throws Throwable {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/a"))).perform();
    }

    @Then("^Users click on Mac option$")
    public void User_click_on_Mac_option() throws Throwable {
        driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[3]")).click();
    }

    @Then ("^User click on Add to cart button$")
    public void User_click_on_Add_to_cart_button() throws Throwable {
driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div/div[2]/div[2]/button[1]/span")).click();
    }

    @Then ("^User click on Add to wish list button$")
    public void User_click_on_Add_to_wish_list_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div/div[2]/div[2]/button[2]")).click();
    }
    @Then ("^User click on Compare This Product button$")
    public void User_click_on_Compare_This_Product_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id='content']/div[2]/div/div/div[2]/div[2]/button[3]")).click();
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
   // Then User click on Add to cart button
   // Then User click on Add to wish list button