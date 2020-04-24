package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flipkart.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement Search;
	@FindBy(xpath="//a[text()='Login']")
	private WebElement Login;
	@FindBy(xpath="//div[text()='More']")
	private WebElement More;
	@FindBy(xpath="//span[text()='Cart']")
	private WebElement Cart;
	@FindBy(xpath="//span[text()='Electronics']")
	private WebElement Electronics;
	@FindBy(xpath="//span[text()='TVs & Appliances']")
	private WebElement TVs;
	@FindBy(xpath="//span[text()='Men']")
	private WebElement Men;
	@FindBy(xpath="//span[text()='Women']")
	private WebElement Women;
	@FindBy(xpath="//span[text()='Baby & Kids']")
	private WebElement Baby;
	@FindBy(xpath="//span[text()='Home & Furniture']")
	private WebElement Home;
	@FindBy(xpath="//span[text()='Sports, Books & More']")
	private WebElement Sports;
	@FindBy(xpath="//span[text()='Grocery']")
	private WebElement Grocery;
	@FindBy(xpath="//div[text()='Logout']")
	private WebElement Logout;
	
	public void clickOnSearch() {
		Search.click();
	}
	
	public void clickOnLogin() {
		Login.click();
	}
	public void clickOnMore() {
		More.click();
	}
	public void clickOnCart() {
		Cart.click();
	}
	public void clickOnElectronics() {
		Electronics.click();
	}
	public void clickOnTVs() {
		TVs.click();
	}
	public void clickOnMen() {
		Men.click();
	}
	public void clickOnWomen() {
		Women.click();
	}
	public void clickOnBaby() {
		Baby.click();
	}
	public void clickOnHome() {
		Home.click();
	}
	public void clickOnSports() {
		Sports.click();
	}
	public void clickOnGrocery() {
		Grocery.click();
	}
	public void clickOnLogout() {
		Logout.click();
	}

	/*public void clickOnLogout() {
		// TODO Auto-generated method stub
		
	}*/

}
