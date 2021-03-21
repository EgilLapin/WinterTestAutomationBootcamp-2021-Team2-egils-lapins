package pageObjects;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import stepDefinitions.GeneralSteps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ascending extends GeneralSteps {

    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";


    @Before
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver");
        driver = new ChromeDriver();

    }

    @Given("^User opens Webpage$")
    public void user_opens_Webpage() throws Throwable {
        // Launching URL
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=20");

        // Locating select tag web element
        WebElement product = driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div[4]/div"));
        Select select = new Select(product);

        // Get all options
        List allOptionsElement = select.getOptions();

        // Creating a list to store drop down options
        List options = new ArrayList();

        // Storing options in list
        for (WebElement optionElement : allOptionsElement) {
            options.add(optionElement.getText());
        }
// Removing "Select" option as it is not actual option
        options.remove("Select");

        // Default order of option in drop down
        System.out.println("Options in dropdown with Default order :" + options);

        // Creating a temp list to sort
        List tempList = new ArrayList(options);


        // Sort list ascending
        Collections.sort(tempList);


        System.out.println("Sorted List " + tempList);


        // equals() method checks for two lists if they contain the same elements in the same order.
        boolean ifSortedAscending = options.equals(tempList);

        if (ifSortedAscending) {
            System.out.println("List is sorted");
        } else
            System.out.println("List is not sorted.");






    }
}
