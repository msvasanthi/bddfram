package Browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class browserc {
    public static WebDriver driver;
    public static WebDriverWait wait;


    public static void setup() throws IOException {
        try {
            String choice=browserc.properties("browser");

            if (choice.equalsIgnoreCase("Chrome")) {
                driver = new ChromeDriver();
            } else if (choice.equalsIgnoreCase("Edge")) {
                driver =new EdgeDriver();
            } else {
                System.out.println("pls enter the browser details");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }

    public static String properties(String browser) throws IOException {
//String filePath = System.getProperty("C:\\Users\\vasan\\IdeaProjects\\venkatesh\\src\\main\\resources\\Configure.properties");
        FileReader reader = new FileReader("C:\\Users\\vasan\\IdeaProjects\\BDD\\src\\main\\resources\\Configure.properties");
        Properties p = new Properties();
        p.load(reader);
        return p.getProperty(browser);
    }



    public static void geturl (String data) throws IOException, InterruptedException {

       // driver.get(browserc.properties("url"));
        driver.get(data);
        driver.manage().window().maximize();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.id("sp-cc-accept")).click();
    }
    public static void teardown ()
    {
        driver.close();
    }

}

