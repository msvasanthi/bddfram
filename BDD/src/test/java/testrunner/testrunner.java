package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//feature",glue ={"stepdefinition"},
plugin = {"pretty","html:target/test1report.html"})
public class testrunner extends AbstractTestNGCucumberTests {
}
