package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Electronics {
	@FindBy(xpath="//a[text()='Mobiles']")
	private WebElement Mob;
	@FindBy(xpath="//a[text()='Mobile Accessories']")
	private WebElement Mobile;
	@FindBy(xpath="//a[text()='Smart Wearable Tech']")
	private WebElement Sma;
	@FindBy(xpath="//a[text()='Laptops']")
	private WebElement Laptops;
	@FindBy(xpath="//a[text()='Desktop PCs']")
	private WebElement Desktop;
	@FindBy(xpath="//a[text()='Gaming & Accessories']")
	private WebElement Gaming;
	@FindBy(xpath="//a[text()='Computer Accessories']")
	private WebElement Comp;
	@FindBy(xpath="//a[text()='Computer Peripherals']")
	private WebElement Computer;
	@FindBy(xpath="//a[text()='Speakers']")
	private WebElement Speakers;
	@FindBy(xpath="(//a[text()='Smart Home Automation'])[1]")
	private WebElement Smart;
	@FindBy(xpath="//a[text()='Camera']")
	private WebElement Camera;
	@FindBy(xpath="(//li[text()='Featured'])[1]")
	private WebElement Featured;
	
	public void clickOnMob() {
		Mob.click();
	}
	public void clickOnMobile() {
		Mobile.click();
	}
	public void clickOnSma() {
		Sma.click();
	}
	public void clickOnLaptops() {
		Laptops.click();
	}
	public void clickOnDesktop() {
		Desktop.click();
	}
	public void clickOnGaming() {
		Gaming.click();
	}
	public void clickOnComp() {
		Comp.click();
	}
	public void clickOnComputer() {
		Computer.click();
		
	}
	public void clickOnSpeakers() {
		Speakers.click();
	}
	public void clickOnSmart() {
		Smart.click();
	}
	public void clickOnCamera() {
		Camera.click();
	}
	public void clickOnFeatured() {
		Featured.click();
	}

}
