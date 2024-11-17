package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver= null;
	@Given("browser is open")
	public void browser_is_open() {
		String projectPath= System.getProperty("user.dir");
		System.out.println("Project path: "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	}

	@Given("user is on the google search page")
	public void user_is_on_the_google_search_page() {
		driver.get("https://www.google.com");
	}

	@When("user enters a text in google search box")
	public void user_enters_a_text_in_google_search_box() {
		driver.findElement(By.name("q")).sendKeys("Yash Chouhan");
	}

	@When("hits Enter")
	public void hits_Enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to the Search Results page")
	public void user_is_navigated_to_the_Search_Results_page() {
		driver.getPageSource().contains("Yash Chouhan Profiles | Facebook");
		driver.quit();
	}



}
