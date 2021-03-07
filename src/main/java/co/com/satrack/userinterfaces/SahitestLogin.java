package co.com.satrack.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SahitestLogin {
    public static final Target USER_NAME_INPUT = Target.the("The user name").locatedBy("//input[@name='user']");
    public static final Target PASSWORD_INPUT = Target.the("The password").locatedBy("//input[@name='password']");
    public static final Target LOGIN_BUTTON = Target.the("The login button").locatedBy("//input[@value='Login']");
    public static final Target ERROR_MESSAGE_DIV = Target.the("The error message").locatedBy("//div[@id='errorMessage']");
}
