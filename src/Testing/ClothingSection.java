package Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Flipkart.BaseClass;

public class ClothingSection extends BaseClass {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		@Test
		public void clothingSection() throws InterruptedException {
			Actions act1=new Actions(driver);
			act1.moveToElement(driver.findElement(By.xpath("//span[@class='_1QZ6fC _3Lgyp8'][text()='Women']"))).perform();
			Thread.sleep(5000);
			Actions act2=new Actions(driver);
			act2.moveToElement(driver.findElement(By.xpath("//a[@title='Sarees']"))).perform();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@title='Sarees']")).click();
			Thread.sleep(3000);
		}


	}


