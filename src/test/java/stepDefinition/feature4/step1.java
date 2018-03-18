package stepDefinition.feature4;

import cucumber.api.java.en.Given;

/**
 * Created by sahil.mu on 24-07-2017.
 */
public class step1 {
    BaseUtil base;

    public step1(BaseUtil base) {
        this.base = base;
    }

    @Given("^print the value of the variable A$")
    public void printMessage() {
        System.out.println("step1: Value = " + base.name);
        System.out.println("\n");
    }
}
