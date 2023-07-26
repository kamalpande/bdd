package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserStepDef {
	//WebDriver driver;
	WebDriver driver = new ChromeDriver();
	@Given("User is on Login Page")
	public void user_is_on_login_page() throws InterruptedException 
	{
		
		driver.get("http://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    
	}
	/*@When("User enters login credential")
	public void user_enters_login_credential()
	{
		
		WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
	    uname.sendKeys("tomsmith");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("SuperSecretPassword!");
		
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	}*/
	
	/*@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) 
	{
		WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
	    uname.sendKeys(strUser);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys(strPwd);
		
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	}*/
	
	//DataTable as list of list
/*	@When("User enters login credential")
	public void user_enters_login_credential(io.cucumber.datatable.DataTable dataTable)
	
	{
	   List<List<String>> users = dataTable.asLists();
	  // user1 - uname, pwd
	// user2 - uname, pwd 
	   String strUser = users.get(0).get(0);
	   String strPwd = users.get(0).get(1);
	   WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
	    uname.sendKeys(strUser);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys(strPwd);
		
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	   
	}*/
	

	//DataTable as list of map
	@When("User enters login credential")
	public void user_enters_login_credential(io.cucumber.datatable.DataTable dataTable)
	
	{
		List<Map<String,String>> users = dataTable.asMaps();
		
	   //List<List<String>> users = dataTable.asLists();
	  // user1 - uname, pwd
	// user2 - uname, pwd 
	   String strUser = users.get(0).get("username");
	   String strPwd = users.get(0).get("password");
	   WebElement uname = driver.findElement(By.xpath("//input[@id='username']"));
	    uname.sendKeys(strUser);
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys(strPwd);
		
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in")).click();
	   
	}
	
	@Then("Should display Home Page")
	public void should_display_home_page()
	{
		boolean isValidUser = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isValidUser);
	}
    
	   
}
