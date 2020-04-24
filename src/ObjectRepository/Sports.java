package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Flipkart.BaseClass;

public class Sports extends BaseClass {
	@FindBy(xpath="(//img[@class='_3togXc'])[1]")
	private WebElement _3t;
	@FindBy(xpath="(//img[@class='_3togXc'])[2]")
	private WebElement _3to;
	@FindBy(xpath="(//img[@class='_3togXc'])[3]")
	private WebElement _3tog;
	@FindBy(xpath="(//img[@class='_3togXc'])[4]")
	private WebElement _3togXc;
	
	public void clickOn_3t() {
		_3t.click();
	}
	public void clickOn_3to() {
		_3to.click();
	}
	public void clickOn_3tog() {
		_3tog.click();
	}
	public void clickOn_3togXc() {
		_3togXc.click();
	}

}
