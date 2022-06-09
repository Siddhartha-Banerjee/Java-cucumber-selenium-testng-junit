package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks 
{
	@Before("@mobiletest")
	public void mobiletestbefore()
	{
		System.out.println("mobile test pre requisite using hook \n "
				+ "should not use background and hooks together");
	}
	
	@After()
	public void aftertest()
	{
		System.out.println("close browsers\n");
	}
}
