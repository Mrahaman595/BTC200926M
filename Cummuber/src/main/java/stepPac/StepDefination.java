package stepPac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	
	WebDriver dr;
	@Given("^open brower$")
	public void open_brower() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  dr.get("http://www.facebook.com");
	}

	@Given("^navigate to URL$")
	public void navigate_to_URL() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 dr.findElement(By.id("email")).sendKeys("");
	}

	@When("^User type userID  textBOX$")
	public void user_type_userID_textBOX() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("pass")).sendKeys(""); 
	}

	@When("^user type password in passwordBox$")
	public void user_type_password_in_passwordBox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		dr.findElement(By.id("u_0_2")).click();
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^user should be in his profile page$")
	public void user_should_be_in_his_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  if(dr.findElement(By.id("signout")).isDisplayed()){
		  System.out.println("not in profile");
	  }
	}
	@Then("^user should not be in his profile page$")
	public void user_should_not_be_in_his_profile_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
	}


}
