package stepDefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class SameProducts7and5  {
    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";


    @Before
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver");
        driver = new ChromeDriver();


    }

    @When("^User clicks on Laptops&Notebooks$")
    public void user_clicks_on_Laptops_Notebooks() {
        driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")).click();
    }

    @When("^User clicks on Show All Laptops&Notebooks$")
    public void user_clicks_on_Show_All_Laptops_Notebooks() {
        driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']")).click();
    }

    @Then("^User checks Laptops&Notebooks products from this category$")
    public boolean user_checks_Laptops_Notebooks_products_from_this_category() {
       // Determines if the supplied product name is found on the page
        // the product name to be searched for
        //return true if the product name is found, false otherwise

        List <WebElement> options = driver.findElements(By.className("Laptops & Notebooks"));
        for (WebElement product : options)
        {
            if (product.getText().trim().equals("product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12"))
                return true;
        }

        return false;
    }


       // @After
        public void closeBrowser () throws InterruptedException {
            Thread.sleep(2000);
            driver.quit();
        }

    }

