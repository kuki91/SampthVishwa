package StepDefinitionsForSVish;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Transfer.feature",glue={"StepDefinition"}

		)

public class TestRunnerForTransfer {

}
