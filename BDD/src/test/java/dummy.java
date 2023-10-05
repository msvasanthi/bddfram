import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class dummy {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.co.uk/ ");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.id("sp-cc-accept")).click();
        WebElement ele= driver.findElement(By.id("twotabsearchtextbox"));
        ele.sendKeys("shoe");
        ele.sendKeys(Keys.ENTER);

        String uele=driver.getTitle();
    }
}
