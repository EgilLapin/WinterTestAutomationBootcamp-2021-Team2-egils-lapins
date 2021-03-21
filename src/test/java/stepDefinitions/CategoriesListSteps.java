package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CategoriesListSteps {

    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";


    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriverusr");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        //  MainPO = PageFactory.initElements(driver, Page.class);
    }

    @Given("^Users navigate to home page$")
    public void User_navigate_to_home_page() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=common/home");
    }
    @Then("^User hover over Desktops dropdown$")
    public void User_hover_over_Desktops_dropdown() throws Throwable {
        driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/a]")).click();

        ///html/body/div[1]/nav/div[2]/ul/li[1]/a
       // Actions act = new Actions(driver);
       // act.moveToElement(driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/a"))).click();
    }

    @Then ("^User hover over dropdown menu$")
    public void User_hover_over_dropdown_menu() throws Throwable {
        driver.findElement(By.className("dropdown-menu")).click();
    }
    //a[text()=\"Components\"]
   // @FindBy(how = How.XPATH, using = "//a[text()=\"Components\"]")
   // public WebElement selectComponents;
//a[text()=\"Components\"]
//a[text()=\"Monitors (2)\"]

    @And ("^User click on PC$")
    public void User_click_on_PC() throws Throwable {
        driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[1]/div/div/ul/li[1]/a")).click();
    }

    @And ("^User click on Mac$")
    public void User_click_on_Mac() throws Throwable {
        driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[3]")).click();
    }

    @And ("^User click on Laptops Notebooks$")
    public void User_click_on_Laptops_Notebooks() throws Throwable {
        driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[4]")).click();
    }

    @And ("^User click on Macs$")
    public void User_click_on_Macs() throws Throwable {
        driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[4]")).click();
    }

    @And ("^User click on Windows$")
    public void User_click_on_Windows() throws Throwable {
        driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[4]")).click();
    }

    @And ("^User click on Components$")
    public void User_click_on_Components() throws Throwable {
        driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[5]")).click();
    }

    @And ("^User click on Tablets$")
    public void User_click_on_Tablets() throws Throwable {
        driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[6]")).click();
    }

    @And ("^User click on Software$")
    public void User_click_on_Software() throws Throwable {
        driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[5]")).click();
    }

    @And ("^User click on Phones PDAs$")
    public void User_click_on_Phones_PDAs() throws Throwable {
        driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[6]")).click();
    }

    @And ("^User click on Cameras$")
    public void User_click_on_Cameras() throws Throwable {
        driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[7]")).click();
    }

    @And ("^User click on MP3 Players$")
    public void User_click_on_MP3_Players() throws Throwable {
        driver.findElement(By.xpath("//*[@id='column-left']/div[1]/a[8]")).click();
    }
    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
