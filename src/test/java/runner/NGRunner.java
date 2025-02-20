package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdef",
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class NGRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
    @Test // This is a workaround to run Cucumber with TestNG
    public void runnerResult() {
        // This method is a workaround to run Cucumber with TestNG
    }
}
