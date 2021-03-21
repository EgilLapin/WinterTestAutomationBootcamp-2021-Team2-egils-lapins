package stepDefinitions;


import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pageObjects.Page;

import java.net.MalformedURLException;
import java.util.List;

public class WishList4and3 extends GeneralSteps {

    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";



    @Before
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver");
        driver = new ChromeDriver();

    }


    @Given("^User opens Webpage$")
    public void user_opens_Webpage() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=common/home");

    }


    @When("^User clicks on Show All Desktops from Product menu$")
    public void user_clicks_on_one_section_from_Product_menu() throws Throwable {


        WebElement select = driver.findElement(By.xpath("//a[text()='Show All Desktops']"));
        List<WebElement> options = select.findElements(By.xpath("//a[contains(text(),'Desktops')]"));

        for (WebElement option : options) {

            if("Desktops".equals(option.getText()))

                option.click();

        }
    }

    @And("^User clicks on one product from Desktops Product page$")
    public void user_clicks_on_one_product_from_Product_page() throws Throwable {



        driver.findElement(By.xpath("//a[text()='Apple Cinema 30\"']")).click();
    }

    @And("^User navigates to Wish List icon$")
    public void user_navigates_to_Wish_List_icon() throws Throwable {


        driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).getText();
        Thread.sleep(1000);

        Assert.assertTrue(driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).isDisplayed());



    }

    @And("^User clicks on Add to Wish List icon$")
    public void user_clicks_on_Add_to_Wish_List_icon() throws Throwable {
        driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).click();

    }

    @Then("^User see message$")
    public void user_see_message() throws Throwable {


        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).isDisplayed());
    }

    @Then("^Item is added to Wish List$")
    public void item_is_added_to_Wish_List() throws Throwable {
        Thread.sleep(3000);

        Assert.assertTrue(driver.findElement(By.xpath("//button[@data-original-title='Add to Wish List']")).isDisplayed());

    }

    @When("^User clicks on Tablets from Product menu$")
    public void user_clicks_on_Tablets_from_Product_menu() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[4]/a")).click();
    }

    @When("^User clicks on one product from Tablets Product page$")
    public void user_clicks_on_one_product_from_Tablets_Product_page() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")).click();

    }

    @When("^User clicks on Phones&PDAs from Product menu$")
    public void user_clicks_on_Phones_PDAs_from_Product_menu() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();
    }

    @When("^User clicks on one product from Phones&PDAs  Product page$")
    public void user_clicks_on_one_product_from_Phones_PDAs_Product_page() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")).click();
    }


    @When("^User clicks on Cameras from Product menu$")
    public void user_clicks_on_Cameras_from_Product_menu() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[7]/a")).click();
    }

    @When("^User clicks on one product from Cameras Product page$")
    public void user_clicks_on_one_product_from_Cameras_Product_page() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a")).click();
    }


    @When("^User clicks on Show All MPPlayers from Product menu$")
    public void user_clicks_on_Show_All_MP_Players_from_Product_menu() throws Throwable {



        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[8]/a"))).perform();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[8]/div/a")).click();

    }


    @When("^User clicks on one product from MPPlayers Product page$")
    public void user_clicks_on_one_product_from_MP_Players_Product_page() throws Throwable {
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[2]/div[1]/h4/a")).click();

    }

    @When("^User clicks on Mac from Product menu$")
    public void user_clicks_on_Mac_from_Product_menu() throws Throwable {

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/a"))).perform();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[2]/a")).click();



    }

    @When("^User clicks on one product from Mac Product page$")
    public void user_clicks_on_one_product_from_Mac_Product_page() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/div/div[2]/div[1]/h4/a")).click();
    }

    @When("^User navigates to Components and clicks on Monitors from Product menu$")
    public void user_navigates_to_Components_and_clicks_on_Monitors_from_Product_menu() throws Throwable {

        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a"))).perform();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[3]/div/div/ul/li[2]/a")).click();

    }

    @When("^User clicks on one product from Monitors Product page$")
    public void user_clicks_on_one_product_from_Monitors_Product_page() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")).click();
    }




    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }



}
