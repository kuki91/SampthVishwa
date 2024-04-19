package StepDefinitionsForSVish;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import PageFoctory_SVish.SVish_home;
import PageFoctory_SVish.SVish_login;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutSteps {

	WebDriver driver;
	SVish_login Vlogin;
	SVish_home Vhome;


	@Before
	public void browser_is_open() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

		System.out.println("======== Page factory2=========");
	}


	@Given("user is on Vishwa login page")
	public void user_is_on_vishwa_login_page() throws InterruptedException {


		driver.get("https://uatweb.sampath.lk/OmniRetailClient/servletcontroller");	
		driver.manage().window().maximize();
		Thread.sleep(4000);
		Vlogin = new SVish_login(driver);
		Vlogin.Click_BFloginBtn();
		
		

	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {

		Vlogin.enters_username_password();
		
	}

	@And("click on login button")
	public void click_on_login_button() {
		Vlogin.click_loginBtn();
		driver.navigate().refresh();
	}

	@Then("user is navigeted to hame page")
	public void user_is_navigeted_to_hame_page() {
		Vhome = new SVish_home(driver);
		Vhome.findTransferBtn();
	}

	@Given("user is logged into the Vishwa")
	public void user_is_logged_into_the_vishwa() {

	}
	@When("user click on logout button")
	public void user_click_on_logout_button() {
	    Vhome.ClickLogOut_BTN();
	}

	@Then("user is logout from the system")
	public void user_is_logout_from_the_system() {
	 
	}
	
}
