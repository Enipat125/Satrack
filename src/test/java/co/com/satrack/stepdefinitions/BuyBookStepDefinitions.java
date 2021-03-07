package co.com.satrack.stepdefinitions;

import co.com.satrack.tasks.BuyBook;
import co.com.satrack.tasks.Login;
import co.com.satrack.tasks.OpenTheBrowser;
import co.com.satrack.userinterfaces.SahitestHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.satrack.userinterfaces.SahitestAvailableBooks.GRAND_TOTAL_INPUT;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsOnlyText;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.hasValue;

public class BuyBookStepDefinitions {

    private SahitestHomePage sahitestHomePage;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the (.*) with (.*) wants to buy books$")
    public void thatTheWithWantsToBuyBooks(String username, String password) {
        theActorCalled(username).wasAbleTo(OpenTheBrowser.on(sahitestHomePage));
        theActorInTheSpotlight().attemptsTo(Login.withData(username,password));
    }

    @When("^he buy core Java quantity (.*), ruby for rail quantity (.*)  and Python Cookbook quantity (.*)$")
    public void heBuyCoreJavaQuantityRubyForRailQuantityAndPythonCookbookQuantity(String quantityJava, String quantityRuby, String quantityPython) {
        theActorInTheSpotlight().attemptsTo(BuyBook.addShoppingCart(quantityJava,quantityRuby,quantityPython));
    }

    @Then("^she should see in the screen total buy value (.*)$")
    public void sheShouldSeeInTheScreenTotalBuyValue(String totalBuyValue) {
        theActorInTheSpotlight().should(seeThat(the(GRAND_TOTAL_INPUT),hasValue(totalBuyValue)));
    }
}
