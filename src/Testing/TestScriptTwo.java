package Testing;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Flipkart.BaseClass;
import ObjectRepository.Footwear;
import ObjectRepository.Mens;
import ObjectRepository.Sports;

public class TestScriptTwo extends BaseClass{
	@Test
	public void testOnTestScriptTwo() throws InterruptedException {
		Mens me=PageFactory.initElements(driver,Mens.class);
		me.clickOnFootwear();
		Thread.sleep(2000);
		Footwear ft=PageFactory.initElements(driver,Footwear.class);
		ft.clickOnSports();
		Thread.sleep(2000);
		Sports sp=PageFactory.initElements(driver,Sports.class);
		sp.clickOn_3t();
		Thread.sleep(2000);
	}

}
