package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class DatadrivenSteps {
	WebDriver driver= null;
	
	@Given("that the browser is open")
	public void that_the_browser_is_open() {
		String projectPath= System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@And("user is on the login page")
	public void user_is_on_the_login_page() {
		driver.get("http://example.testproject.io/web/");
	}

	@When("user enters yash and {int}")
	public void user_enters_yash_and(Integer int1) {
	   driver.findElement(By.id("name")).sendKeys("Yash");
	   driver.findElement(By.id("password")).sendKeys("12345");
	}

	@And("usr clicks on login button")
	public void usr_clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
