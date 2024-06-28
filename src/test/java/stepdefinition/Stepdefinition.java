package stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Cucumber.Capstone.BaseClass;

public class Stepdefinition extends BaseClass {
	
	@Given("I launch the URL")
	public void i_launch_the_url() {
		
		driver.get("http://the-internet.herokuapp.com/");
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	 @Then("I verify the title of the page is {string}")
	 public void i_verify_the_title_of_the_page_is(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @When("I click on the link {string}")
	 public void i_click_on_the_link(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("I verify the text {string} on the page")
	 public void i_verify_the_text_on_the_page(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @When("I select {string} from the dropdown")
	 public void i_select_from_the_dropdown(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("I verify {string} is selected")
	 public void i_verify_is_selected(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

	 @Then("I verify the presence of link {string}")
	 public void i_verify_the_presence_of_link(String string) {
	     // Write code here that turns the phrase above into concrete actions
	     throw new io.cucumber.java.PendingException();
	 }

		    // Implement other steps similarl

}
