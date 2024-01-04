package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;

public class StepDef {
	public WebDriver driver;
	public LoginPage lp;
	@Given("user launch the url")
	
	@Given("user launch the url {string}")
	public void user_launch_the_url(String string) {
		lp=new LoginPage(driver);
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver-win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(string);
		
	}

	@When("user enter the user id as {string} and password as {string}")
	public void user_enter_the_user_id_as_and_password_as(String string, String string2) {
		lp.setUser(string);
		lp.pass(string2);
	}

	@When("user click on login")
	public void user_click_on_login() {
	    lp.clickSave();
	}

	@When("user click on products")
	public void user_click_on_products() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user click on add button")
	public void user_click_on_add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter the name")
	public void user_enter_the_name() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter the price")
	public void user_enter_the_price() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter the catogery")
	public void user_enter_the_catogery() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter the slug")
	public void user_enter_the_slug() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enter the release year")
	public void user_enter_the_release_year() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user click on save")
	public void user_click_on_save() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
