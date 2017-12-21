package Expedia.testExpedia.bookcruise;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import Expedia.testExpedia.actions.book_cruise;
import Expedia.testExpedia.testbase.TestBase;



public class book_cruise_test extends TestBase {
	book_cruise Runcruisetest;
	WebDriver driver;
	
	
	@BeforeClass 
	public void runBrowser(){
		inti();
	}
	
	
	@Test
	public void book_cruise(){
		
		Runcruisetest = new book_cruise(driver);
		Runcruisetest.DestinationButton("Cuba");
		Runcruisetest.DepartureButton("Oct 2017");
		Runcruisetest.adultsAge("5");
		Runcruisetest.childrenAge("4");
		Runcruisetest.clickonsearch();
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException{
		
		Thread.sleep(5000);
		driver.close();
	}
	
	
}


