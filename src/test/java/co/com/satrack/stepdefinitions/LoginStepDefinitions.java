package co.com.satrack.stepdefinitions;

import co.com.satrack.tasks.Login;
import co.com.satrack.tasks.OpenTheBrowser;
import co.com.satrack.userinterfaces.SahitestHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.satrack.userinterfaces.DemoErrorPage.FIVE_HUNDRED_HTTP_ERROR_DIV;
import static co.com.satrack.userinterfaces.SahitestAvailableBooks.ADD_BUTTON;
import static co.com.satrack.userinterfaces.SahitestLogin.ERROR_MESSAGE_DIV;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.containsOnlyText;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;


public class LoginStepDefinitions {

    private SahitestHomePage sahitestHomePage;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that (.*) wants to start session$")
    public void thatEniWantsToStartSession(String username) throws Exception {
        theActorCalled(username).wasAbleTo(OpenTheBrowser.on(sahitestHomePage));
    }

    @When("^she enter user (.*) and password (.*)$")
    public void sheEnterUserAndPassword(String username, String password) throws Exception {
        theActorInTheSpotlight().attemptsTo(Login.withData(username,password));
    }

    @Then("^she should see the books available in the screen$")
    public void sheShouldSeeTheBooksAvailableInTheScreenWithStatus() throws Exception {
       theActorInTheSpotlight().should(seeThat(the(ADD_BUTTON),isVisible()));
    }

    @Given("^that (.*) wants to start session with invalid data$")
    public void thatWantsToStartSessionWithInvalidData(String username) throws Exception {
        theActorCalled(username).wasAbleTo(OpenTheBrowser.on(sahitestHomePage));
    }

    @When("^she enter user (.*) and invalid password (.*)$")
    public void sheEnterUserAndInvalidPassword(String username, String password) throws Exception {
        theActorInTheSpotlight().attemptsTo(Login.withData(username,password));
    }

    @Then("^she should see error message Invalid username or password in the screen$")
    public void sheShouldSeeErrorMessageInvalidUsernameOrPasswordInTheScreen() throws Exception {
        theActorInTheSpotlight().should(seeThat(the(ERROR_MESSAGE_DIV),containsOnlyText("Invalid username or password")));
    }
}
