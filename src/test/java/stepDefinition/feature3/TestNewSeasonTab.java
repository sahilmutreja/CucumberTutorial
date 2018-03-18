package stepDefinition.feature3;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by sahil.mu on 23-07-2017.
 */
public class TestNewSeasonTab {
    BaseUtil base;

    public TestNewSeasonTab(BaseUtil base) {
        this.base = base;
    }

    @When("^I click New Season tab$")
    public void iClickNewSeasonTab() {
        System.out.println("Name = " + base.name);
        base.driver.findElement(By.cssSelector("a.series.ads-evt")).click();
    }

    @Then("^site should show me a list of season with title as \"([^\"]*)\"$")
    public void siteShouldShowMeAListOfSeasonWithTitleAs(String tabTItle) throws Throwable {
        String title = base.driver.findElement(By.cssSelector(".anime_name.new_series>h2")).getText();
        Assert.assertTrue(title.equals(tabTItle));
    }
}
