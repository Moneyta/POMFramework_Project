package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	private WebElement _2zrpKA;
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	private WebElement _3v41xv;
	@FindBy(xpath="(//span[text()='Login'])[2]")
	private WebElement Login;
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement Request;
	@FindBy(xpath="//a[text()='New to Flipkart? Create an account']")
	private WebElement New;
	public void enter_2zrpKA() {
		_2zrpKA.sendKeys("patramoneyta21@gmail.com");
	}
	public void enter_3v41xv() {
		_3v41xv.sendKeys("Money@143");
	}

	public void clickOnLogin() {
		Login.click();
		
	}
	public void clickOnRequest() {
		Request.click();
	}
	public void clickOnNew() {
		New.click();
	}
	//public void enter_2zrpKA() {
		// TODO Auto-generated method stub
		
//	}
	
	
	
	


}
