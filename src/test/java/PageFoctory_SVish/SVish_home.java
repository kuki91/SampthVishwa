package PageFoctory_SVish;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SVish_home {

	WebDriver driver;

	@FindBy(id = "C11__BUT_3A79C1C8110876CD182663")
	WebElement btn_transfer;

	@FindBy(id = "C10__p4_BUT_F6A61BDCCE0BE222609605")
	WebElement btn_logout;
	
	@FindBy(css = "div.modal-content")
	WebElement Modal_logout;
	
	@FindBy(id = "C10__BUT_B7F6D2BF937217ED209622")
	WebElement btn_LogOutYes;

	public SVish_home(WebDriver driver){

		this.driver  = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,30), this);
	}

	public void findTransferBtn() {

		btn_transfer.isDisplayed();
		System.out.println("find the transfer button");
	}
	public void ClickTransfer_BTN() {

		btn_transfer.click();


	}
	public void ClickLogOut_BTN() {
		btn_logout.click();
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.modal-content")));
		 
		
			
		//Modal_logout.findElement(By.id("C10__BUT_B7F6D2BF937217ED209622"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click();", btn_LogOutYes);
		System.out.println("find the modal  YES");
		//btn_LogOutYes.click();
	}

}
