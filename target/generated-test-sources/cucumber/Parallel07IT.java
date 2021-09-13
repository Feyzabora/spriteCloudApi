import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        strict = true,
        features = {"/Users/Fey/.jenkins/Projects/Github/spriteCloudApi/src/test/java/features/UserEndpoints.feature:36"},
        plugin = {"testng:/Users/Fey/.jenkins/Projects/Github/spriteCloudApi/target/cucumber-parallel/7.xml"},
        monochrome = true,
        glue = {"steps"})
public class Parallel07IT extends AbstractTestNGCucumberTests {
}
