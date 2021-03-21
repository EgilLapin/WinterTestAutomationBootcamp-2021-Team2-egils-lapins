
package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownSubSteps {


    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";


    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriverusr");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();

    }


    @Given("^User navigate to home page$")
    public void User_navigate_to_home_page() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=common/home");
    }

    @Then("^User hover over Desktop dropdown$")
    public void When_User_hover_over_Desktop_dropdown() throws Throwable {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/a"))).perform();
    }

    @Then("^User hover over Laptops_Notebooks drop down$")
    public void User_hover_over_Laptops_Notebooks_drop_down() throws Throwable {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[2]/a"))).perform();
    }

    @Then("^User hover over Components drop down$")
    public void User_hover_over_Components_drop_down() throws Throwable {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a"))).perform();
    }

    @Then("^User hover over Tablets drop down$")  //NO
    public void User_hover_over_Tablets_drop_down() throws Throwable {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[4]/a"))).perform();
    }

    @Then("^User hover over Software drop down$")  //NOUser hover over Software drop down
    public void Then_User_hover_over_Software_drop_down() throws Throwable {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[5]/a"))).perform();
    }

    @Then("^User hover over Phones_PDAs drop down$") //NO
    public void Then_User_hover_over_Phones_PDAs_drop_down() throws Throwable {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[6]/a"))).perform();
    }

    @Then("^User hover over Cameras drop down$")
    public void User_hover_over_Cameras_drop_down() throws Throwable {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[7]/a"))).perform();
    }

    @Then("^User hover over MP3 Players drop down$")
    public void User_hover_over_MP3_Players_drop_down() throws Throwable {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[8]/a"))).perform();
    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}

//Assert.assertTrue(driver.findElement(By.xx("").isDisplayed());
