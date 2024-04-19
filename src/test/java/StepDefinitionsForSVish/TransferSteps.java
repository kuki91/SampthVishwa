//package StepDefinitionsForSVish;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import PageFoctory_SVish.SVish_OtpPage;
//import PageFoctory_SVish.SVish_home;
//import PageFoctory_SVish.SVish_login;
//import PageFoctory_SVish.SVish_transfer;
//import io.cucumber.java.Before;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class TransferSteps {
//
//	WebDriver driver;
//	SVish_login Vlogin;
//	SVish_home Vhome;
//	SVish_transfer Vtansfer;
//	SVish_OtpPage VOtpPage;
//
//	@Before
//	public void browser_is_open() {
//
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
//
//		System.out.println("======== Page factory=========");
//	}
//
//
//	@Given("user is on Vishwa login page")
//	public void user_is_on_vishwa_login_page() throws InterruptedException {
//
//
//		driver.get("https://uatweb.sampath.lk/OmniRetailClient/servletcontroller");	
//		driver.manage().window().maximize();
//		Thread.sleep(4000);
//		Vlogin = new SVish_login(driver);
//		Vlogin.Click_BFloginBtn();
//		
//		
//
//	}
//
//	@When("user enters username and password")
//	public void user_enters_username_and_password() {
//
//		Vlogin.enters_username_password();
//		
//	}
//
//	@And("click on login button")
//	public void click_on_login_button() {
//		Vlogin.click_loginBtn();
//		driver.navigate().refresh();
//	}
//
//	@Then("user is navigeted to hame page")
//	public void user_is_navigeted_to_hame_page() {
//		Vhome = new SVish_home(driver);
//		Vhome.findTransferBtn();
//	}
//
//	@Given("user is logged into the Vishwa")
//	public void user_is_logged_into_the_vishwa() {
//
//	}
//
//	@When("user is navigated to tranfer")
//	public void user_is_navigated_to_taranfer() {
//
//		Vhome.ClickTransfer_BTN();
//
//	}
//
//	@And("User is selected Other SampathBank Accounts radio button")
//	public void user_is_selected_other_sampath_bank_accounts_radio_button() {
//		Vtansfer = new SVish_transfer(driver);
//		Vtansfer.selectOtherBankTransfer();
//	}
//
//	@And("user is filled the {long} and {long} and {int} and transferPupose")
//	public void user_is_filled_the_and_and_and_transfer_pupose(long fromAccountNo,long toAccountNo,int amount) {
//		Vtansfer.wait_until_loadForm();		
//		Vtansfer.selectTranferType();				
//		Vtansfer.selectFromAccount(fromAccountNo);
//		System.out.println("haanasdhdjs"+toAccountNo);
//		//Vtansfer.EnterTextValues(toAccountNo, amount);
//		//Vtansfer.selectTransferPurpose();
//	}
//
//
//	@And("user is click on continue")
//	public void user_is_click_on_continue() {
//	//	Vtansfer.ClickContinue();
//	}
//
//	@Then("The OTP page is displayed.")
//	public void the_otp_page_is_displayed() {
//		VOtpPage = new SVish_OtpPage(driver);
//		VOtpPage.findHeader_OtpPage();
//	}	
//
//	@And("user is logged out from Vishwa")
//	public void user_is_logged_out_from_vishwa() {
//		VOtpPage.ClickLogoutBtn();
//	}
//
//	public void tearDown() {
//		driver.quit();
//	}
//
//}
