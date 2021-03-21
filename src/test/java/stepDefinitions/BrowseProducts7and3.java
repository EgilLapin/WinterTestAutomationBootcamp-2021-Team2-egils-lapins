package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BrowseProducts7and3 {


    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";



    @Before
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver");
        driver = new ChromeDriver();

    }

    @When("^User navigates To Product Menu$")
    public void user_navigates_To_Product_Menu() throws Throwable {

        driver.get("http://www.demoshop24.com/index.php?route=common/home");

    }

    @When("^User clicks on Show All Desktops category$")
    public void user_clicks_on_Show_All_Desktops_category() throws Throwable {


        WebElement select = driver.findElement(By.xpath("//a[text()='Desktops']"));
        List<WebElement> options = select.findElements(By.xpath("//a[text()='Show All Desktops']"));

        for (WebElement option : options) {

            if("Show All Desktops".equals(option.getText()))

                option.click();

        }

    }

    @Then("^User counts of products is displayed$")
    public void user_counts_of_products_is_displayed() throws Throwable {

        List products = driver.findElements(By.className("product-thumb"));
        System.out.println("Count of Available products:"+products.size());


    }

    @Then("^User clicks on PC subcategory$")
    public void user_clicks_on_PC_subcategory() throws Throwable {
        WebElement select = driver.findElement(By.xpath("//a[text()='Desktops']"));
        List<WebElement> options = select.findElements(By.xpath("//a[text()='PC']"));

        for (WebElement option : options) {

            if("PC".equals(option.getText()))

                option.click();
        }

    }

    @Then("^User see message: \"([^\"]*)\"$")
    public void user_see_message(String arg1) throws Throwable {
        Assert.assertEquals(arg1, driver.findElement(By.xpath("//p[text()='There are no products to list in this category.']")).getText());
        //Assert.assertEquals("There are no products to list in this category.", driver.findElement(By.xpath("//*[text()='There are no products to list in this category.']")).getText());
       // Assert.assertTrue("\"//*[text()='There are no products to list in this category.']\", ");
       // Assert.assertEquals(arg1, driver.findElement(By.tagName("p")).getText());


       // Assert.assertEquals(arg1, driver.findElement(By.xpath("//*[text()='There are no products to list in this category.']")).getText());
    //"//*[text()='There are no products to list in this category.']"


    }

    @Then("^User clicks on Mac subcategory$")
    public void user_clicks_on_Mac_subcategory() throws Throwable {
        WebElement select = driver.findElement(By.xpath("//a[text()='Desktops']"));
        List<WebElement> options = select.findElements(By.xpath("//a[text()='Mac']"));

        for (WebElement option : options) {

            if("Mac".equals(option.getText()))

                option.click();
        }

    }


    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
