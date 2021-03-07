package co.com.satrack.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.satrack.userinterfaces.SahitestLogin.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Login implements Task {
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(USER_NAME_INPUT,isVisible()));
        actor.attemptsTo(WaitUntil.the(PASSWORD_INPUT,isVisible()));
        actor.attemptsTo(Enter.theValue(username).into(USER_NAME_INPUT));
        actor.attemptsTo(Enter.theValue(password).into(PASSWORD_INPUT));
        actor.attemptsTo(Click.on(LOGIN_BUTTON));
    }

    public static Login withData(String username, String password) {
        return instrumented(Login.class,username,password);
    }
}
