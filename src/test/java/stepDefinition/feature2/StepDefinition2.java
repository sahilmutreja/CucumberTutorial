package stepDefinition.feature2;

import cucumber.api.java.en.Given;
import stepDefinition.feature1.SharedClass;

/**
 * Created by sahil.mu on 10-07-2017.
 */
public class StepDefinition2 {


    String name;

    public StepDefinition2(SharedClass sharedObject) {
        this.name = sharedObject.setValue();
    }
    @Given("^I print the same shared variable$")
    public void iPrintSharedVariable() throws Throwable {
        System.out.println("Shared Name from feature2: " + name);
    }
}
