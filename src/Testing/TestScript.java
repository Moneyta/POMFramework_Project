package Testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Flipkart.BaseClass;
import ObjectRepository.Electronics;
import ObjectRepository.Mi;
import ObjectRepository.Mobile;

public class TestScript extends BaseClass {
	@Test
	public void testOnTestScript() throws InterruptedException {
		Electronics ee=PageFactory.initElements(driver,Electronics.class);
		ee.clickOnMobile();
		Thread.sleep(2000);
		Mobile mb=PageFactory.initElements(driver,Mobile.class);
		mb.clickOnMi();
		Thread.sleep(2000);
		Mi mi=PageFactory.initElements(driver,Mi.class);
		mi.clickOnRedmi();
		Thread.sleep(2000);
		
		
	}

}
