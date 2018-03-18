package stepDefinition.feature4;

import cucumber.api.java.Before;

public class Hooks {

    BaseUtil base;

    public Hooks(BaseUtil base) {
        this.base = base;
    }

    @Before({"@Feature4", "@ScenarioA"})
    public void initString1(){
        base.name = "ScenarioA";
    }

    @Before({"@Feature4", "@ScenarioB"})
    public void initString2(){
        base.name = "ScenarioB";
    }
}
