package stepDefiniation;

import java.io.IOException;

import core.Base;
import io.cucumber.java.en.*;
import pageObjects.LoginPageObjects;
import utilities.Utilities;

public class LoginSteps extends Base {
	
	LoginPageObjects login = new LoginPageObjects();
	
	@Given("User is on test environment homepage")
	public void user_is_on_test_environment_homepage() throws IOException {
	    login.textV();
	    logger.info("Homepage validated successfully");
	    Utilities.takeScreenShot("Homepage");
	}

	@When("user click on myaccount button")
	public void user_click_on_myaccount_button() {
		login.tButton();
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
	   login.tLogin();
	 
	}

	@Then("user enter username and password")
	public void user_enter_username_and_password() {
	    login.userName();
	    login.passField();
	}
	@Then("user enter {string} and {string}")
	public void user_enter_and(String username, String password) {
		login.userName(username);
		login.passField(password);
	   
	}
	@Then("user click on login button to login to the page")
	public void user_click_on_login_button_to_login_to_the_page() {
		login.buttonMe();
	}


}
