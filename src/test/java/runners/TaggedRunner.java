package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TaggedRunner {
	@CucumberOptions(
			
			features = "src\\test\\resources\\taggedFeatures\\",	
			glue = {"stepDefs"},
			monochrome = true,
			dryRun=false,
//			tags = "@SmokeTest"
			tags = "@PhaseTwo or @SmokeTest"
//			tags = "@RegressionTest"
			,plugin= {"pretty",
					"usage:target/reports/usageReport",
		     		"html:target/reports/HTMLReport.html"
				,"json:target/reports/JSONReport.json",
					"testng:target/reports/TestngReport.xml"
				,"rerun:target/reports/failedScenarios.txt"
					,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					}
				)

		public class GooglePageRunner extends AbstractTestNGCucumberTests{
			
		  
		}
}
