import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"/Users/Fey/.jenkins/Projects/Github/spriteCloudApi/src/test/java/features/UserEndpoints.feature:27"},
        plugin = {"testng:/Users/Fey/.jenkins/Projects/Github/spriteCloudApi/target/cucumber-parallel/4.xml"},
        monochrome = true,
        glue = {"steps"})
public class Parallel04IT extends AbstractTestNGCucumberTests {
}
