package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Test {
    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";



    @Before
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver");
        driver = new ChromeDriver();

    }


    @Given("^User navigates to Mac List page$")
    public void user_navigates_to_Mac_List_page() throws Throwable {

        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=20_27");

    }

    @Then("^Count of products is displayed Mac List Page$")
    public void count_of_products_is_displayed_Mac_List_Page() throws Throwable {

        List products = driver.findElements(By.className("product-thumb"));
        System.out.println("Count of Available products:"+products.size());

    }
    @Given("^User navigates to PC List page$")
    public void user_navigates_to_PC_List_page() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=20_26");
    }

    @Then("^Count of products is displayed PC List Page$")
    public void count_of_products_is_displayed_PC_List_Page() throws Throwable {
        List products = driver.findElements(By.className("product-thumb"));
        System.out.println("Count of Available products:"+products.size());

    }


    @Given("^User navigates to Macs List page$")
    public void user_navigates_to_Macs_List_page() throws Throwable {
      driver.get("http://www.demoshop24.com/index.php?route=product/category&path=18_46");
    }

    @Then("^Count of products is displayed Macs List Page$")
    public void count_of_products_is_displayed_Macs_List_Page() throws Throwable {
        List products = driver.findElements(By.className("product-thumb"));
        System.out.println("Count of Available products:"+products.size());
    }

    @Given("^User navigates to Windows List page$")
    public void user_navigates_to_Windows_List_page() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=18_45");
    }

    @Then("^Count of products is displayed Windows List Page$")
    public void count_of_products_is_displayed_Windows_List_Page() throws Throwable {
        List products = driver.findElements(By.className("product-thumb"));
        System.out.println("Count of Available products:"+products.size());
    }
    @Given("^User navigates to MiceAndTrackballs List page$")
    public void user_navigates_to_MiceAndTrackballs_List_page() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=25_29");

    }

    @Then("^Count of products is displayed MiceAndTrackballs List Page$")
    public void count_of_products_is_displayed_MiceAndTrackballs_List_Page() throws Throwable {
        List products = driver.findElements(By.className("product-thumb"));
        System.out.println("Count of Available products:"+products.size());

    }

    @Given("^User navigates to Monitors List page$")
    public void user_navigates_to_Monitors_List_page() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=25_28");

    }

    @Then("^Count of products is displayed Monitors List Page$")
    public void count_of_products_is_displayed_Monitors_List_Page() throws Throwable {
        List products = driver.findElements(By.className("product-thumb"));
        System.out.println("Count of Available products:"+products.size());

    }

    @Given("^User navigates to Printers List page$")
    public void user_navigates_to_Printers_List_page() throws Throwable {

        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=25_30");

    }

    @Then("^Count of products is displayed Printers List Page$")
    public void count_of_products_is_displayed_Printers_List_Page() throws Throwable {
        List products = driver.findElements(By.className("product-thumb"));
        System.out.println("Count of Available products:"+products.size());

    }

    @Given("^User navigates to Scanners List page$")
    public void user_navigates_to_Scanners_List_page() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=25_31");

    }

    @Then("^Count of products is displayed Scanners List Page$")
    public void count_of_products_is_displayed_Scanners_List_Page() throws Throwable {
        List products = driver.findElements(By.className("product-thumb"));
        System.out.println("Count of Available products:"+products.size());

    }

    @Given("^User navigates to WebCameras List page$")
    public void user_navigates_to_WebCameras_List_page() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=25_32");

    }

    @Then("^Count of products is displayed WebCameras List Page$")
    public void count_of_products_is_displayed_WebCameras_List_Page() throws Throwable {
        List products = driver.findElements(By.className("product-thumb"));
        System.out.println("Count of Available products:"+products.size());

    }



    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


}





