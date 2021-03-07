package co.com.satrack.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SahitestAvailableBooks {
    public static final Target ADD_BUTTON = Target.the("The button add").locatedBy("//input[@value='Add']");
    public static final Target QUANTITY_JAVA_INPUT = Target.the("the Core Java quantity").locatedBy("//table[@id ='listing']//td[contains(.,'Core Java')]//following-sibling::td[3]/input[@name='q']");
    public static final Target QUANTITY_RUBY_INPUT = Target.the("the Ruby for Rails quantity").locatedBy("//table[@id ='listing']//td[contains(.,'Ruby for Rails')]//following-sibling::td[3]/input[@name='q']");
    public static final Target QUANTITY_PYTHON_INPUT = Target.the("the Python Cookbook quantity").locatedBy("//table[@id ='listing']//td[contains(.,'Python Cookbook')]//following-sibling::td[3]/input[@name='q']");
    public static final Target GRAND_TOTAL_INPUT = Target.the("the grand total").locatedBy("//input[@id ='total']");
}
