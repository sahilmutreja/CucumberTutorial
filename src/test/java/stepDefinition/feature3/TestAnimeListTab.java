package stepDefinition.feature3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

/**
 * Created by sahil.mu on 21-07-2017.
 */
public class TestAnimeListTab {
    BaseUtil base;

    public TestAnimeListTab(BaseUtil base) {
        this.base = base;
    }

    @Given("^Gogoanime website is open$")
    public void gogoanimeWebsiteIsOpen() {
        System.out.println("Name = " + base.name);
        String websiteURL = base.driver.getCurrentUrl();
        Assert.assertTrue(websiteURL.contains("gogoanime.io"));
    }

    @When("^I click Anime List tab$")
    public void iClickAnimeListTab() {
        base.driver.findElement(By.cssSelector("a.list.ads-evt")).click();
    }

    @Then("^site should show me a list of animes with title as \"([^\"]*)\"$")
    public void siteShouldShowMeAListOfAnimesWithSectionTitleAs(String tabTItle) {
        String title = base.driver.findElement(By.cssSelector(".anime_name.anime_list>h2")).getText();
        Assert.assertTrue(title.equals(tabTItle));
    }

}
