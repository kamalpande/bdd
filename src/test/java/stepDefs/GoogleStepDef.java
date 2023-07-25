package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import com.aventstack.extentreports.gherkin.model.Scenario;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.AfterStep;

public class GoogleStepDef {
	
	WebDriver driver = new ChromeDriver();
	@Given("User launch google page")
	public void user_launch_google_page() {
	    //driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	}
	@When("User Search Java Tutorial")
	public void user_search_java_tutorial() {
	   WebElement schBox = driver.findElement(By.name("q"));
	   schBox.sendKeys("Java Tutorial");
	   schBox.submit();
	   
	}
	@Then("Should display Java result page")
	public void should_display_java_result_page() {
	    Assert.assertEquals(driver.getTitle(), "Java Tutorial - Google Search");
	}
	
	@When("User Search Selenium Tutorial")
	public void user_search_selenium_tutorial()
	{
		WebElement schBox = driver.findElement(By.name("q"));
		   schBox.sendKeys("Selenium Tutorial");
		   schBox.submit();
		   
	}
	@Then("Should display Selenium result page")
	public void should_display_selenium_result_page() 
	{
	    Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google Search");
	}
	
	@When("User Search Cypress Tutorial")
	public void user_search_cypress_tutorial()
	{
		WebElement schBox = driver.findElement(By.name("q"));
		   schBox.sendKeys("Cypress Tutorial");
		   schBox.submit();
	}
	@Then("Should display Cypress result page")
	public void should_display_cypress_result_page() 
	{
		 Assert.assertEquals(driver.getTitle(), "Cypress Tutorial - Google Search"); 
	}
	
	
	@After
	public void attachScreenshot(Scenario scenario)
	{
		
		if(scenario.isFailed())
		{
			//driver = new ChromeDriver();
			TakesScreenshot screen = (TakesScreenshot)driver;
			byte[] imgByte = screen.getScreenshotAs(OutputType.BYTES);
			scenario.attach(imgByte,"img/png","ImageOne");
		}
			
	}
	

}
