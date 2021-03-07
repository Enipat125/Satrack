package co.com.satrack.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.satrack.userinterfaces.SahitestAvailableBooks.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuyBook implements Task {

    private String quantityJava;
    private String quantityRuby;
    private String quantityPython;

    public BuyBook(String quantityJava, String quantityRuby, String quantityPython) {
        this.quantityJava = quantityJava;
        this.quantityRuby = quantityRuby;
        this.quantityPython = quantityPython;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(QUANTITY_JAVA_INPUT,isVisible()));
        actor.attemptsTo(Enter.theValue(quantityJava).into(QUANTITY_JAVA_INPUT));
        actor.attemptsTo(Enter.theValue(quantityRuby).into(QUANTITY_RUBY_INPUT));
        actor.attemptsTo(Enter.theValue(quantityPython).into(QUANTITY_PYTHON_INPUT));
        actor.attemptsTo(Click.on(ADD_BUTTON));

    }

    public static BuyBook addShoppingCart(String quantityJava, String quantityRuby, String quantityPython) {
        return instrumented(BuyBook.class, quantityJava, quantityRuby, quantityPython);
    }
}
