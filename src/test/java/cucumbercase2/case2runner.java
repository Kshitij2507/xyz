package cucumbercase2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:src/test/java/cucumbercase2/output/cucumber25.json"})
public class case2runner {

}
