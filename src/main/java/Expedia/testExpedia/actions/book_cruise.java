package Expedia.testExpedia.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class book_cruise {
	
	public static WebDriver driver;
	

	
	public book_cruise (WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cruise-destination-cruiselp")
	WebElement destination ;
  
	public void DestinationButton (String source){
		Select destinationTo = new Select (destination);
		destinationTo.selectByVisibleText(source);
	}
	
	
	@FindBy(id = "cruise-departure-month-cruiselp")
	WebElement departure;
	
	public void  DepartureButton (String source){
		Select departuremonth = new Select (departure);
		departuremonth.selectByVisibleText(source);
	}
		
	
	@FindBy (id = "cruise-adults-cruiselp")
	WebElement Adults;
	
	public void adultsAge (String source){
		Select Age = new Select(Adults);
		Age.deselectByVisibleText(source);
		
	}
	@FindBy (id = "childAges-cruiselp")
	WebElement Children;
	
	public void childrenAge (String source){
		Select Age = new Select(Children);
		Age.deselectByVisibleText(source);
	
	}
	@FindBy (xpath = ".//*[@id='gcw-cruises-form-cruiselp']/div[3]/div/button")
	WebElement Search;
	
	public void clickonsearch ( ){
		Search.click();
		
	}
	
	}


