package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flipkart.BaseClass;

public class Footwear extends BaseClass {
	@FindBy(xpath="(//a[text()='Sports Shoes'])[1]")
	private WebElement Sports;
	@FindBy(xpath="(//a[text()='Casual Shoes'])[1]")
	private WebElement Casual;
	@FindBy(xpath="(//a[text()='Formal Shoes'])[1]")
	private WebElement Formal;
	@FindBy(xpath="//a[text()='Sandals & Floaters']")
	private WebElement Sandals;
	@FindBy(xpath="//a[text()='Flip- Flops']")
	private WebElement Flip;
	@FindBy(xpath="(//a[text()='Loafers'])[1]")
	private WebElement Loafers;
	@FindBy(xpath="(//a[text()='Boots'])[1]")
	private WebElement Boots;
	@FindBy(xpath="//a[text()='Running Shoes']")
	private WebElement Running;
	@FindBy(xpath="(//a[text()='Sneakers'])[1]")
	private WebElement Sneakers;
	
	public void clickOnSports() {
		Sports.click();
	}
	public void clickOnCasual() {
		Casual.click();
	}
	public void clickOnFormal() {
		Formal.click();
	}
	public void clickOnSandals() {
		Sandals.click();
	}
	public void clickOnFlip() {
		Flip.click();
	}
	public void clickOnLoafers() {
		Loafers.click();
	}
	public void clickOnBoots() {
		Boots.click();
	}
	public void clickOnRunning() {
		Running.click();
	}
	public void clickOnSneakers() {
		Sneakers.click();
	}

}
