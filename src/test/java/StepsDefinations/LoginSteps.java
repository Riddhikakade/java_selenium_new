package StepsDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("inside steps: browser is open");
	}
	    
		
	@When("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("inside steps : user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside steps :inside steps : user enters username and password");
	}
	    

	@And("Click on the login button")
	public void click_on_the_login_button() {
		System.out.println("inside steps : user clicks on login button");
	    
	}

	@Then("user in nevigate to the homepage")
	public void user_in_nevigate_to_the_homepage() {
		System.out.println("inside steps : user is nevigate to the homepage");
	    
	}




	
}
