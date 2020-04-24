package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flipkart.BaseClass;

public class Mens extends BaseClass{
	@FindBy(xpath="(//a[text()='Footwear'])[1]")
	private WebElement Footwear;
	//@FindBy(xpath="")
	@FindBy(xpath="(//a[text()='Clothing'])[1]")
	private WebElement Clothing;
	@FindBy(xpath="//a[text()='Top wear']")
	private WebElement Top;
	@FindBy(xpath="//a[text()='Ties, Socks, Caps & more']")
	private WebElement Ties;
	@FindBy(xpath="//a[text()='Kurta, Pyjama & more']")
	private WebElement Kurta;
	@FindBy(xpath="//a[text()='Fabrics']")
	private WebElement Fabrics;
	@FindBy(xpath="//a[text()='Bottom wear']")
	private WebElement Bottom;
	@FindBy(xpath="//a[text()='Seasonal Wear']")
	private WebElement Seas;
	@FindBy(xpath="//a[text()='Sports wear']")
	private WebElement Sports;
	@FindBy(xpath="//a[text()='Innerwear & Sleepwear']")
	private WebElement Innerwear;
	@FindBy(xpath="(//a[text()='Watches'])[1]")
	private WebElement Watches;
	@FindBy(xpath="(//a[text()='Accessories'])[1]")
	private WebElement Accessories;
	@FindBy(xpath="(//a[text()='Smart Watches'])[1]")
	private WebElement Sma;
	@FindBy(xpath="(//a[text()='Smart Bands'])[2]")
	private WebElement Smart;
	@FindBy(xpath="(//a[text()='Personal Care Appliances'])[1]")
	private WebElement Personal;
	
	public void clickOnFootwear() {
		Footwear.click();
	}
	public void clickOnClothing() {
		Clothing.click();
	}
	public void clickOnTop() {
		Top.click();
	}
	public void clickOnTies() {
		Ties.click();
	}
	public void clickOnKurta() {
		Kurta.click();
	}
	public void clickOnBottom() {
		Bottom.click();
	}
	public void clickOnSeas() {
		Seas.click();
	}
	public void clickOnSports() {
		Sports.click();
	}
	public void clickOnInnerwear() {
		Innerwear.click();
	}
	public void clickOnWatches() {
		Watches.click();
	}
	public void clickOnAccessories() {
		Accessories.click();
	}
	public void clickOnSma() {
		Sma.click();
	}
	public void clickOnSmart() {
		Smart.click();
	}
	public void clickOnPersonal() {
		Personal.click();
	}
	

}
