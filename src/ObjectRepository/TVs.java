package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flipkart.BaseClass;

public class TVs extends BaseClass{
	@FindBy(xpath="//a[text()='Television']")
	private WebElement Television;
	@FindBy(xpath="//a[text()='New Launches']")
	private WebElement New;
	@FindBy(xpath="//a[text()='Smart & Ultra HD']")
	private WebElement Smart;
	/*@FindBy(xpath="//a[text()='Top Brands']")
	private WebElement Top;*/
	@FindBy(xpath="//a[text()='Washing Machine']")
	private WebElement Washing;
	@FindBy(xpath="(//a[text()='Air Conditioners'])[1]")
	private WebElement Air;
	@FindBy(xpath="(//a[text()='Refrigerators'])[1]")
	private WebElement Refrigerators;
	@FindBy(xpath="//a[text()='Kitchen Appliances']")
	private WebElement Kitchen;
	@FindBy(xpath="//a[text()='Small Home Appliances']")
	private WebElement Small;
	
	public void clickOnTelevision() {
		Television.click();
	}
	public void clickOnNew() {
		New.click();
	}
	public void clickOnSmart() {
		Smart.click();
	}
	public void clickOnWashing() {
		Washing.click();
	}
	public void clickOnAir() {
		Air.click();
	}
	public void clickOnRefrigerators() {
		Refrigerators.click();
	}
	public void clickOnKitchen() {
		Kitchen.click();
	}
	public void clickOnSmall() {
		Small.click();
	}

}
