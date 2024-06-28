import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class LaunchPage {
	
	WebDriver driver;

	@Given("I launch the URL")
	public void i_launch_the_url() {
		
		driver.get("http://the-internet.herokuapp.com/");
	    // Write code here that turns the phrase above into concrete actions
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\automation\\eclipse-workspace\\Capstone\\chromedriver_win32 (1).exe");

		driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");

	}

}
