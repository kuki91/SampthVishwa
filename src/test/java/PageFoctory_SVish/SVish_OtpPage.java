package PageFoctory_SVish;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SVish_OtpPage {
	WebDriver driver;

	@FindBy( id = "C3__C1__HEAD_AF4FBA51E51F2BBB307733")
	WebElement header_OTP;

	@FindBy(id = "C10__BUT_F6A61BDCCE0BE222609605")
	WebElement btn_logout;

	public SVish_OtpPage(WebDriver driver){

		this.driver  = driver;
		PageFactory.initElements(driver, this);

	}

	public void findHeader_OtpPage() {

		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(d -> header_OTP.isDisplayed());
		System.out.println("find the home button");
	}
	public void ClickLogoutBtn() {

		btn_logout.click();

	}

}
