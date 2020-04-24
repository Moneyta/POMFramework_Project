package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flipkart.BaseClass;

public class Cart extends BaseClass{
	@FindBy(xpath="//span[text()='Bangalore - 560103']")
	private WebElement Bangalore;
	@FindBy(xpath="//input[@class='LM6RPg']")
	private WebElement LM6RPg;
	@FindBy(xpath="//span[text()='Place Order']")
	private WebElement Place;
	@FindBy(xpath="(//input[@class='_2csFM9'])[1]")
	private WebElement _2csFM9;
	@FindBy(xpath="//div[text()='Save for later']")
	private WebElement Save;
	@FindBy(xpath="(//div[text()='Remove'])[1]")
	private WebElement Remove;
	@FindBy(xpath="(//button[@class='wNrY5O'])[1]")
	private WebElement wNr;
	@FindBy(xpath="(//button[@class='wNrY5O'])[2]")
	private WebElement wNrY5O;
	@FindBy(xpath="//div[@class='_2aUbKa']")
	private WebElement _2aUbKa;
	
	public void clickOnBangalore() {
		Bangalore.click();
	}
	public void clickOnLM6RPg() {
		LM6RPg.click();
	}
	public void clickOnPlace() {
		Place.click();
	}
	public void clickOn_2csFM9() {
		_2csFM9.click();
	}
	public void clickOnSave() {
		Save.click();
	}
	public void clickOnRemove() {
		Remove.click();
	}
	public void clickOnwNr() {
		wNr.click();
	}
	public void clickOnwNrY5O() {
		wNrY5O.click();
	}
	public void clickOn_2aUbKa() {
		_2aUbKa.click();
	}
	

}
