package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flipkart.BaseClass;

public class Delivery extends BaseClass{
	@FindBy(xpath="//button[text()='Change']")
	private WebElement Change;
	@FindBy(xpath="//button[text()='Deliver Here']")
	private WebElement Deliver;
	@FindBy(xpath="//button[text()='EDIT']")
	private WebElement EDIT;
	
	public void clickOnChange() {
		Change.click();
	}
	public void clickOnDeliver() {
		Deliver.click();
	}
	public void clickOnEDIT() {
		EDIT.click();
	}

}
