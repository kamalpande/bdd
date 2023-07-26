package stepDefs;

import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TaggedStepDef 
{
	@BeforeAll
	public static void setup()
	{
		System.out.println("Before All the scenarios...");
	}
	
	@Before
	public void eachScenario()
	{
		System.out.println("Before Each scenarios...");
	}
	
	@BeforeStep
	public void eachStep()
	{
		System.out.println("Before Each step...");
	}
	
	@AfterAll
	public static void teardown()
	{
		System.out.println("After All the scenarios...");
	}
	
	@Given("User is logged in")
	public void user_is_logged_in() 
	{
	   System.out.println("User is logged in");
	}
	
	@When("User create a task")
	public void user_create_a_task() 
	{
		System.out.println("User create a task");
	}
	@When("User update a task")
	public void user_update_a_task() 
	{
		System.out.println("User update a task");
	}
	
	@When("User delete a task")
	public void user_delete_a_task()
	{
		System.out.println("User delete a task");
	}
	
	@When("User create a Deals")
	public void user_create_a_deals()
	{
		System.out.println("User create a Deals");
	}
	@When("User update a Deals")
	public void user_update_a_deals() 
	{
		System.out.println("User update a Deals");
	}
	@When("User delete a Deals")
	public void user_delete_a_deals() 
	{
		System.out.println("User delete a Deals");
	}
	@When("User create a contact")
	public void user_create_a_contact()
	{
		System.out.println("User create a contact");
	}
	@When("User update a contact")
	public void user_update_a_contact() 
	{
		System.out.println("User update a contact");
	}
	
	@When("User delete a contact")
	public void user_delete_a_contact()
	{
		System.out.println("User delete a contact");
	}


}
