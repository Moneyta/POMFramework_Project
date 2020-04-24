package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Flipkart.BaseClass;

public class OfferZone extends BaseClass{
	@Test
	public void OfferZone() throws InterruptedException {
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Offer Zone']"))).click();
		Thread.sleep(3000);
		Actions act2=new Actions(driver);
		act2.moveToElement(driver.findElement(By.xpath("(//img[@class='_2VeolH _3I5S6S'])[1]"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		Actions act3=new Actions(driver);
		act3.moveToElement(driver.findElement(By.xpath("(//img[@class='_2VeolH _3I5S6S'])[2]"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@class='_2VeolH _3I5S6S'])[1]")).click();
		Thread.sleep(3000);
	}

}
