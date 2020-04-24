package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mobile {
	@FindBy(xpath="(//a[text()='Mi'])[1]")
	private WebElement Mi;
	@FindBy(xpath="//a[text()='Realme']")
	private WebElement Real;
	@FindBy(xpath="//a[text()='Samsung']")
	private WebElement Sams;
	@FindBy(xpath="//a[text()='Infinix']")
	private WebElement Infinix;
	@FindBy(xpath="//a[text()='OPPO']")
	private WebElement OPPO;
	@FindBy(xpath="//a[text()='Apple']")
	private WebElement Apple;
	@FindBy(xpath="//a[text()='Vivo']")
	private WebElement Vivo;
	@FindBy(xpath="//a[text()='Honor']")
	private WebElement Honor;
	@FindBy(xpath="//a[text()='Asus']")
	private WebElement Asus;
	@FindBy(xpath="//a[text()='realme 5i']")
	private WebElement realme;
	@FindBy(xpath="//a[text()='Samsung S10 Lite']")
	private WebElement Samsung;
	@FindBy(xpath="//a[text()='Redmi 8A']")
	private WebElement Red;
	@FindBy(xpath="(//a[text()='Redmi 8'])[1]")
	private WebElement Redmi;
	
	public void clickOnMi() {
		Mi.click();
	}
	public void clickOnReal() {
		Real.click();
	}
	public void clickOnSams() {
		Sams.click();
	}
	public void clickOnInfinix() {
		Infinix.click();
	}
	public void clickOnOPPO() {
		OPPO.click();
	}
	public void clickOnApple() {
		Apple.click();
		
	}
	public void clickOnVivo() {
		Vivo.click();
	}
	public void clickOnHonor() {
		Honor.click();
	}
	public void clickOnAsus() {
		Asus.click();
	}
	public void clickOnrealme() {
		realme.click();
	}
	public void clickOnSamsung() {
		Samsung.click();
	}
	public void clickOnRed() {
		Red.click();
	}
	public void clickOnRedmi() {
		Redmi.click();
	}

}
