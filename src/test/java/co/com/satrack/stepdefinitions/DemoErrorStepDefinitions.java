package co.com.satrack.stepdefinitions;

import co.com.satrack.tasks.Login;
import co.com.satrack.tasks.Navigate;
import co.com.satrack.tasks.OpenTheBrowser;
import co.com.satrack.userinterfaces.SahitestDemoHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.satrack.userinterfaces.DemoErrorPage.FIVE_HUNDRED_HTTP_ERROR_DIV;
import static co.com.satrack.userinterfaces.SahitestAvailableBooks.ADD_BUTTON;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsOnlyText;




public class DemoErrorStepDefinitions {

    private SahitestDemoHomePage sahitestDemoHomePage;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that user wants enter en the page sahitest_demo$")
    public void that_user_wants_enter_en_the_page_sahitest_demo() throws Exception {
        theActorCalled("Eni").wasAbleTo(OpenTheBrowser.on(sahitestDemoHomePage));
    }

    @When("^she enter error pages and five hundred page$")
    public void she_enter_error_pages_and_five_hundred_page() throws Exception {
        theActorInTheSpotlight().attemptsTo(Navigate.byErrorPages());

    }

    @Then("^she should see in screen http error five hundred$")
    public void she_should_see_in_screen_http_error_five_hundred() throws Exception {
       // theActorInTheSpotlight().should(seeThat(the(FIVE_HUNDRED_HTTP_ERROR_DIV),isVisible()));
        theActorInTheSpotlight().should(seeThat(the(FIVE_HUNDRED_HTTP_ERROR_DIV),containsOnlyText("HTTP ERROR 500")));
    }

}
