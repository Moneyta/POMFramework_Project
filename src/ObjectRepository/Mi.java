package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flipkart.BaseClass;

public class Mi extends BaseClass {
	@FindBy(xpath="//div[text()='Redmi 8 (Onyx Black, 64 GB)']")
	private WebElement Redmi;
	
	public void clickOnRedmi() {
		Redmi.click();
	}

}
