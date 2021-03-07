package co.com.satrack.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class DemoErrorPage {
    public static final Target ERROR_PAGES_HREF = Target.the("The error pages").locatedBy("//a[@href ='errorPages.htm']");
    public static final Target FIVE_HUNDRED_PAGES_HREF = Target.the("The five hundred pages").locatedBy("//a[@href ='/demo/php/500.php']");
    public static final Target FIVE_HUNDRED_HTTP_ERROR_DIV = Target.the("The five hundred http error").locatedBy("//div[@class ='error-code']");
}
