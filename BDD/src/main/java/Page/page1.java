package Page;

import Browser.browserc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static Browser.browserc.driver;
import static Browser.browserc.wait;

public class page1 extends browserc {
    public static void searchtextbox(String data) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(data);
    }
    public static void select(String data) throws InterruptedException {
        // Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label='shoe laces']")));
        System.out.println("executed:");
        List<WebElement> link = driver.findElements(By.xpath("//div[@class=\"s-suggestion-container\"]"));
        for (int i = 0; i < link.size(); i++) {
            if (link.get(i).getText().equalsIgnoreCase(data)) {
                link.get(i).click();
                break;
            }

        }

    }
}







