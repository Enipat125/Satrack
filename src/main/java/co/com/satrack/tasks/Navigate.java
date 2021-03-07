package co.com.satrack.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.satrack.userinterfaces.DemoErrorPage.ERROR_PAGES_HREF;
import static co.com.satrack.userinterfaces.DemoErrorPage.FIVE_HUNDRED_PAGES_HREF;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Navigate implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ERROR_PAGES_HREF,isVisible()));
        actor.attemptsTo(Click.on(ERROR_PAGES_HREF));
        actor.attemptsTo(WaitUntil.the(FIVE_HUNDRED_PAGES_HREF,isVisible()));
        actor.attemptsTo(Click.on(FIVE_HUNDRED_PAGES_HREF));
    }

    public static Performable byErrorPages() {
        return instrumented(Navigate.class);
    }
}
