package stepDefinition.feature4;

import cucumber.api.java.en.Given;

/**
 * Created by sahil.mu on 24-07-2017.
 */
public class step2 {
    BaseUtil base;

    public step2(BaseUtil base) {
        this.base = base;
    }

    @Given("^print the value of the variable B$")
    public void printMessage() {
        System.out.println("step2: Value = " + base.name);
        System.out.println("\n");
    }

}
