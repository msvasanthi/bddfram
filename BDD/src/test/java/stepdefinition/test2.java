package stepdefinition;

import Browser.browserc;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class test2 extends browserc {
    @When("User enter the appropriate {string}")
    public void user_enter_the_appropriate(String string) throws InterruptedException {
        Thread.sleep(2000);
        WebElement ele= driver.findElement(By.id("twotabsearchtextbox"));
        ele.sendKeys(string);
        Thread.sleep(2000);
        ele.sendKeys(Keys.ENTER);
        String uele=driver.getTitle();
        System.out.println(uele);
    }
    @Then("verify user the search result")
    public void verify_user_the_search_result() {
        String uele=driver.getTitle();
        System.out.println(uele+"actually title after search");
        boolean result=uele.matches("Amazon.co.uk : [a-z]*");
        Assert.assertTrue(result);
        //WebElement eleshoe=driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        //Assert.assertEquals(eleshoe,"shoe");

    }




}
