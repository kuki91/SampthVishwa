package PageFoctory_SVish;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SVish_transfer {

	WebDriver driver;

	@FindBy( id = "C3__COL_22BD0A33D956AE42546103")
	WebElement form_transfer;

	@FindBy( id = "C3__C1__QUE_DC287FAA8A452699149879_1")
	WebElement rbtn_otherBT;

	@FindBy(id = "C3__C1__QUE_DC287FAA8A452699595804")
	WebElement Transfer_Type;

	@FindBy( id = "C3__C1__QUE_DC287FAA8A452699603185")
	WebElement dropdown_fromAccount;

	@FindBy( id = "C3__C1__QUE_DC287FAA8A452699611533")
	WebElement txt_toAccount;

	@FindBy( id = "C3__C1__QUE_DC287FAA8A452699611744")
	WebElement txt_toReAccount;

	@FindBy( id = "C3__C1__QUE_DC287FAA8A452699603528")
	WebElement txt_amount;

	@FindBy( id = "C3__C1__QUE_F12FDD60FDA29132459059")
	WebElement dropdown_transferPurpose;

	@FindBy( id = "C3__C1__BUT_DC287FAA8A452699581176")
	WebElement btn_continue;

	public SVish_transfer(WebDriver driver){

		this.driver  = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectOtherBankTransfer() {


		//		Wait <WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//		wait.until(ExpectedConditions.elementToBeClickable(rbtn_otherBT)).click();

		if (!rbtn_otherBT.isSelected()) {
			// 
			//			Actions actions = new Actions(driver);
			//			actions.moveToElement(rbtn_otherBT).click().perform();
			//			System.out.println("hi nsajdnja");
			//rbtn_otherBT.click();

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", rbtn_otherBT);
			//			System.out.println("hi testing");
		}

	}

	public void wait_until_loadForm() {

		Wait <WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(d -> form_transfer.isDisplayed());
		System.out.println("find the transfer home");
	}
	public void selectTranferType(){

		//		String test = getFirstSelectedOption().getText();
		//		System.out.println("hi nsajdnja");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("C3__C1__QUE_DC287FAA8A452699595804")));
		//wait.until(ExpectedConditions.elementToBeClickable(Transfer_Type));
		//	
		Select selectTransfer_Type = new Select(Transfer_Type);
		//		selectTransfer_Type.deselectByValue("QUICK");
		selectTransfer_Type.selectByValue("QUICK");

		//Assertions.assertEquals("Quick Transfer", selectTransfer_Type.getFirstSelectedOption().getText());

		//		String script = "document.getElementById('C3__C1__QUE_DC287FAA8A452699595804').value = 'QUICK';";
		//		((JavascriptExecutor) driver).executeScript(script);

	}
	public void selectFromAccount(long fromAccountNo){	

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("C3__C1__QUE_DC287FAA8A452699603185")));
		String Faccount = Long.toString(fromAccountNo);
		String script2 = "document.getElementById('C3__C1__QUE_DC287FAA8A452699603185').value = '"+Faccount+"';";
		((JavascriptExecutor) driver).executeScript(script2);
		//		wait.until(ExpectedConditions.elementToBeClickable(Transfer_Type));
//				Select selectFrom_Account = new Select(dropdown_fromAccount);
//				String Faccount = Long.toString(fromAccountNo);
//				selectFrom_Account.selectByValue(Faccount);
//				Assertions.assertEquals(fromAccountNo, selectFrom_Account.getFirstSelectedOption().getText());
	}
	//	public int getElementYOffset(WebDriver driver, WebElement element) {
	//	    JavascriptExecutor js = (JavascriptExecutor) driver;
	//	    return ((Long) js.executeScript("return arguments[0].getBoundingClientRect().top + window.scrollY;", element)).intValue();
	//	}
	//	 public static void scrollIntoView(WebDriver driver, WebElement element) {
	//	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	//	        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
	//	    }
	//	 public void scrollToElementByPixelOffset(WebDriver driver, WebElement element, int pixels) {
	//		    JavascriptExecutor js = (JavascriptExecutor) driver;
	//		    int elementYOffset = element.getLocation().getY(); // Get element's Y offset from top
	//		    js.executeScript("window.scrollBy(0, " + (elementYOffset - ((Long) js.executeScript("return arguments[0].getBoundingClientRect().top + window.scrollY;", element)).intValue()) + ")"); // Scroll by the difference
	//		}
	/*
	 * public void EnterTextValues(long toAccountNo, int amount){
	 * 
	 * System.out.println("EnterTextValues"); //int pixels =
	 * getElementYOffset(driver,txt_toAccount); //
	 * scrollToElementByPixelOffset(driver,txt_toAccount,200); WebDriverWait wait =
	 * new WebDriverWait(driver, Duration.ofSeconds(20));
	 * 
	 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
	 * "C3__C1__QUE_DC287FAA8A452699611533"))); System.out.println("buwahaaaa");
	 * txt_toAccount.sendKeys(String.valueOf(toAccountNo));
	 * 
	 * // scrollIntoView(driver,txt_toReAccount);
	 * txt_toReAccount.sendKeys(String.valueOf(toAccountNo)); //
	 * scrollIntoView(driver,txt_amount);
	 * txt_amount.sendKeys(String.valueOf(amount));
	 * 
	 * }
	 */

	/*
	 * public void selectTransferPurpose(){
	 * 
	 * Select selectTransfer_purpose = new Select(dropdown_transferPurpose);
	 * 
	 * selectTransfer_purpose.selectByValue("Family Remitances");
	 * Assertions.assertEquals("Family Remitances",
	 * selectTransfer_purpose.getFirstSelectedOption().getText());
	 * 
	 * } public void ClickContinue() {
	 * 
	 * btn_continue.click(); }
	 */



}
