package Screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static Browser.browserc.driver;

public class capture {
    public static void screenshort(String name) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        String path = "C:\\Users\\vasan\\IdeaProjects\\BDD\\src\\test\\Screen" + name + ".png";
        File target = new File(path);
        FileUtils.copyFile(source, target);


    }
}