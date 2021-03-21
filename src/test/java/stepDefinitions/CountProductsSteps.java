package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountProductsSteps {

    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";



    @Before
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver");
        driver = new ChromeDriver();

    }


    @Given("^User navigates to Product List page$")
    public void user_navigates_to_Product_List_page() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=20");

    }

    @Then("^Count of products is displayed$")
    public void count_of_products_is_displayed() throws Throwable {

        List products = driver.findElements(By.className("product-thumb"));
        System.out.println("Count of Available products:"+products.size());


    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }




}
