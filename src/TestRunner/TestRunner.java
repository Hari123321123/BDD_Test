package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\admin\\eclipse-workspace\\restAssured_reference\\restAssuredframework\\BDD_TEST\\Features\\login.feature", 
glue= {"steps"}
//plugin = {"json:target/cucumber.json","pretty", "html:reports/myreport.html",
	//	 "rerun:target/rerun.txt"}

/*plugin= {
		"pretty", "html:reports/myreport.html",
		 "rerun:target/rerun.txt"  // to capture failures
		},*/)
public class TestRunner {

}
