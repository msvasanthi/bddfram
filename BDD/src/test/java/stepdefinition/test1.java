package stepdefinition;

import Browser.browserc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;

public class test1 extends browserc {
    @Given("User open the browser")
    public void user_open_the_browser() throws IOException {
        browserc.setup();

    }
    @Then("User enter the {string} of the application")
    public void user_enter_the_of_the_application(String string) throws IOException, InterruptedException {
        browserc.geturl(string);

    }
    @And("User verfy the browser  title of the window")
    public void user_verfy_the_browser_title_of_the_window() {
        String title= driver.getTitle();
        System.out.println("user getting Title of  the browser:"+title);
        Assert.assertEquals(title,"Amazon.co.uk: Low Prices in Electronics, Books, Sports Equipment & more");


    }
    @Then("User close the browser")
    public void user_close_the_browser() {
        browserc.teardown();

    }


}
