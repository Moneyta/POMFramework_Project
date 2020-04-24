package Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ObjectRepository.HomePage;
import ObjectRepository.LoginPage;

public class BaseClass {

	public	WebDriver driver;
	public	Actions act;

			@BeforeClass
			public void lunchBrowser() {
				System.setProperty("webdriver.chrome.driver","D:\\SeleniumDriver\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
			}
			@BeforeMethod
			public void loginFlipkart() throws InterruptedException {
				LoginPage lPage=PageFactory.initElements(driver,LoginPage.class);
				lPage.enter_2zrpKA();
				Thread.sleep(2000);
				lPage.clickOnLogin();
				Thread.sleep(2000);
			}
			@AfterMethod
			public void logoutFlipkart() throws InterruptedException {
				driver.switchTo().defaultContent();
				HomePage hPage=PageFactory.initElements(driver,HomePage.class);
				hPage.clickOnLogout();
				Thread.sleep(2000);
				driver.findElement(By.xpath(" ")).click();
				Thread.sleep(2000);
			}
			@AfterClass
			public void closeBrowser() {
				driver.close();
			}
				
			}

	



