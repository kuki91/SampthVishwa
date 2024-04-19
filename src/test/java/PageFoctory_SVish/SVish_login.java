package PageFoctory_SVish;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SVish_login {

	WebDriver driver;

	@FindBy(id = "C1__BUT_4BD3D023CDB8D07B254601")
	WebElement txt_loginBf;

	@FindBy(id = "usernameUserInput")
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "loginBtn")
	WebElement btn_login;

	public SVish_login (WebDriver driver){

	
		this.driver  = driver;
		PageFactory.initElements(driver, this);

	}

	public void Click_BFloginBtn() {

		txt_loginBf.click();
	}


	public void enters_username_password() {

		txt_username.sendKeys("govnbl");
		txt_password.sendKeys("Abc@1234");
	}


	public void click_loginBtn(){
		btn_login.click();

	}

}
