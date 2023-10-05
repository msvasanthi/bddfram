package Page;

import Browser.browserc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static Browser.browserc.driver;

public class page2 extends browserc {
    public static void select2(String data) throws InterruptedException {
        // wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//form[@class='single cart not-added']//button[@type='submit'][normalize-space()='Add to cart']"))).click();
        Thread.sleep(3000);
        List<WebElement> link=driver.findElements(By.xpath("//a[@class=\"nav-a\"]"));
        //List<WebElement> link= driver.findElements(By.id("id attribute is not available for this element"));
        for (int i=0;i< link.size();i++){
            if(link.get(i).getText().equalsIgnoreCase(data)){////a[normalize-space()='Frozen']

                link.get(i).click();
                break;
            }
        }
    }
}

