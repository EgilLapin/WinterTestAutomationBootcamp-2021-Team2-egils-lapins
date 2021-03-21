package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingSteps extends GeneralSteps {


    private WebDriver driver;
    static String libWithDriversLocation = System.getProperty("user.dir") + "/src/test/resources/drivers/";


    @Before
    public void initBrowser() {
        System.setProperty("webdriver.chrome.driver", libWithDriversLocation + "chromedriver");
        driver = new ChromeDriver();

    }

    @Given("^User navigates to the product list page page$")
    public void user_navigates_to_the_product_list_page_page() throws Throwable {
        driver.get("http://www.demoshop24.com/index.php?route=product/category&path=20");
    }

    @When("^User clicks on Sort By box$")
    public void user_clicks_on_Sort_By_box() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[3]/div/label")).click();
    }



    @When("^User clicks on Name ascending sorting$")
public void user_clicks_on_Name_ascending_sorting() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"input-sort\"]/option[2]")).click();
    }


        @Then("^Products are sorted by their name in alphabetical order from A to Z$")
        public void products_are_sorted_by_their_name_in_alphabetical_order_from_A_to_Z() throws Throwable {

       /* WebElement product = driver.findElement(By.xpath("//*[@id=\\\"content\\\"]/div[4]/div"));
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


       */


            int counter = 1;

            List<String> listProductPage = new ArrayList<>();

            String Start_Xpath = "\"//*[@id=\\\"content\\\"]/div[4]/div[\" ";
            String end_xpath = "\"]/div/div[2]/div[1]/h4/a";
            String xpath = Start_Xpath + counter + end_xpath;
            System.out.println("Xpath : " + xpath);

            while (true) {
                xpath = "//*[@id=\"content\"]/div[4]/div[" + counter + "]/div/div[2]/div[1]/h4/a";
                try {
                    listProductPage.add(driver.findElement(By.xpath(xpath)).getText());
                    counter++;
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("End");
                    break;
                }
            }

            //List<String> sortedList = listProductPage.sort();

           // if (sortedList.equals(listProductPage)) {
                System.out.println("Got it");


       /* Select name = new Select(driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div")));
        List actualList=new ArrayList();
        List<WebElement>myName=name.getOptions();
        for(WebElement ele:myName)
        {
            String data=ele.getText();
            actualList.add(data);
        }

        List temp=new ArrayList();
        temp.addAll(actualList);
        //Ascending
        Collections.sort(temp);
        Assert.assertTrue(actualList.equals(temp));*/


            }





    }