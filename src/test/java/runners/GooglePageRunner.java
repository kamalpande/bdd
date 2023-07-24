package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		
	features = "src\\test\\resources\\features\\GoogleSearchPage.feature",	
	glue = {"stepDefs"},
	monochrome = true
		)

public class GooglePageRunner extends AbstractTestNGCucumberTests{
	
  
}
