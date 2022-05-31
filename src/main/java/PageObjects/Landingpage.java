package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {
	
	public WebDriver driver;
	
	By sign =By.xpath("//a[@class='theme-btn register-btn']");
	 
	

	public Landingpage(WebDriver driver) {
		this.driver=driver;
	}



	public WebElement getlogin()
	{
		
		return driver.findElement(sign);
		
	}
	
	
	
	

}
