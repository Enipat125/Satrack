package co.com.satrack.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/buy_books.feature",
        glue = "co.com.satrack.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class BuyBookRunner {

}
