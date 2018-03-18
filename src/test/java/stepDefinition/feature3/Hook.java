package stepDefinition.feature3;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by sahil.mu on 24-07-2017.
 */
public class Hook {

    BaseUtil base;

    private static boolean startBrowser = false;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before("@Feature3")
    public void setUp() {
        System.out.println("Tried to setup");
        base.name = "sahil";
        if (!startBrowser){

            FirefoxDriverManager.getInstance().setup();
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            base.driver = new FirefoxDriver(capabilities);

            base.driver.manage().window().maximize();
            base.driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            base.driver.navigate().to("https://gogoanime.io");
            startBrowser = true;
        }
    }

    @After("@Feature3")
    public void tearDown() {
        base.driver.quit();
    }

}
