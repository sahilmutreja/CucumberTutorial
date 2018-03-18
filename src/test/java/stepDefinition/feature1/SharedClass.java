package stepDefinition.feature1;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by sahil.mu on 03-07-2017.
 */
public class SharedClass {

    private String name;

    /**
     * Set value will set the value for the shared variable
     * @return will return the shared variable value
     */
    public String setValue() {
        name = "sahil";
        return name;
    }

    /**
     *
     */
    @Before("@DataTable")
    public void setup() {
        System.out.println("Message from before function");
    }

    @After("@DataTable")
    public void tearDown() {
        System.out.println("Message from after function");
    }
}
