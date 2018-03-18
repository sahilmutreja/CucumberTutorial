package stepDefinition.feature1;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.MathTest;

import java.util.Map;

public class StepDefinition1 {

    private static int x = 0;
    MathTest maths;
    String msg1, name;

    public StepDefinition1(SharedClass sharedObject) {
        this.name = sharedObject.setValue();
        System.out.println("Step Defin called");
    }

    /**
     * Background Step
     */
    @Given("^I print a message$")
    public void printMessage() {
        x += 1;
        msg1 = "Background message:" + x;
        System.out.print(msg1);
    }

    /**
     * Scenario 1: Simple scenario to print shared variable across step definition in feature 2
     */
    @Given("^I print shared variable$")
    public void iPrintSharedVariable() {
        System.out.println("Scenario 1: Shared Name from feature 1: " + name);
        System.out.println();
    }

    /**
     * Scenario 2 for passing constant parameters
     * @param name
     * @param phone
     */
    @Given("^name is \"(.*?)\" and number is \"(\\d+)\"$")
    public void nameIsAndNumberIs(String name, String phone) {
        System.out.println("Scenario 2: Name: " + name + ", Phone: " + Integer.parseInt(phone));
        System.out.println();
    }

    /**
     * Scenario 3 for passing data in a data table
     * @param table
     */
    @Given("^I enter following info$")
    public void i_enter_following_info(Map<String, String> table) {
        System.out.println("Scenario 3: ");
        System.out.println(table.get("name"));
        System.out.println(table.get("empId"));
        System.out.println();
    }


    /**
     * Scenario 4 for passing data in a table
     * @param arg1
     * @param arg2
     */
    @Given("^(\\d+) and (\\d+) are entered\\.$")
    public void and_are_entered(int arg1, int arg2) {
        maths = new MathTest(arg1,arg2);
    }

    @When("^a is added to b and output is stored in c$")
    public void a_is_added_to_b_and_output_is_stored_in_c() {
        maths.add();
    }

    @Then("^c is equal to sum of a and b$")
    public void c_is_equal_to_sum_of_a_and_b() {
        Assert.assertTrue("c <> a + B", maths.c == (maths.a + maths.b));
        System.out.println("Sum Test passed");
    }

}