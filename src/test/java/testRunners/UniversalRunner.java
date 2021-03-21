package testRunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // Here some tags can be set, for example, tags = {"@Example", "~@ignore"},
        tags = {"@4.1.2WishListIconFromProductCategoryPages"},
        plugin = {"html:target/cucumber", "json:target/cucumber.json"},
        features = {"src/test/resources/features/Egils_WishList.feature"},
        dryRun = false,
        glue = {"stepDefinitions"}
)
public class UniversalRunner {
}
