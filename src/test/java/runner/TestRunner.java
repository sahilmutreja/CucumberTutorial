package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                "classpath:feature/feature1.feature"
//                "classpath:feature/feature2.feature"
        }
        , glue = {"classpath:stepDefinition"}
        , tags = {"@ConstantParams"}
)

public class TestRunner {

    @BeforeClass
    public static void setup() {
        System.out.println("Ran the before Class");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("Ran the after Class");
    }
}

