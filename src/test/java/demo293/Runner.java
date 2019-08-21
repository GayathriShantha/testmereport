package demo293;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature45",glue="demo293",plugin= {"json:target/cucumber.json"})

public class Runner {

}
