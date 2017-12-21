package Expedia.testExpedia.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestBase {
	
	WebDriver driver;
	String baseURL = "https://www.expedia.com/Cruises";
	
	public void inti (){
		 ChooseBrowser ();
		 driverBrowser();
	}
	
	public void ChooseBrowser (){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\Selenium\\testExpedia\\drivers\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver();
	}
	
	public void driverBrowser(){
		
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	

}
