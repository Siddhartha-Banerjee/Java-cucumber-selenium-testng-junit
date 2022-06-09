package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefination
{
	
//from console can get this implementation code if you dont have

	//common steps like opening browser should written as background in feature
	@Given("Validate the browser")
	public void validate_the_browser() 
	{
	    System.out.println("chrome browser is selected");
	}
	@When("Browser is triggered")
	public void browser_is_triggered() 
	{
		System.out.println("chrome browser is triggered");
	}
	@Then("Browser is started")
	public void browser_is_started() 
	{
		System.out.println("chrome browser is opened");
	}

	
	
	@Given("User is on landing page")
	public void user_is_on_landing_page()
	{
		//selenium code
		System.out.println("navigated to landing page");
	}
	
	/*
	@When("User login into application with username and password")
	public void user_login_into_application_with_username_and_password()
	{
		System.out.println("user entered credentials");
	}
	*/
	
	//for log in
	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String string, String string2) 
	{
	    System.out.println("username:"+string+" password: "+string2);
	}


	@When("User sign up with following details")
	public void user_sign_up_with_following_details(DataTable dataTable) 
	{
		List<List<String>> data=dataTable.asLists();
		System.out.println("user entered required details for sign up "+ 
				data.get(0).get(0)+ " "+ 
				data.get(0).get(1)+ " "+ 
				data.get(0).get(2));
	}
	

	@When("^User login into application with usernames (.+) and passwords (.+)$")
	public void user_login_into_application_with_usernames_and_passwords(String un,String pw) 
	{
	    System.out.println(un+" "+pw);
	}


	
	@Then("Home page is populated")
	public void home_page_is_populated()
	{
		System.out.println("home page populated");
	}
	
	@And("Cards are displayed {string}")
	public void cards_are_displayed(String s)
	{
		System.out.println("cards displayed "+s);
		System.out.println();
	}

}
