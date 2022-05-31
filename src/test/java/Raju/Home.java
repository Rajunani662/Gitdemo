package Raju;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjects.Landingpage;
import resources.Baseclass;

public class Home extends Baseclass {
	@Test
	
	public void basePageNavigation() throws IOException {
		
		driver=initilizerDriver();
		
		driver.get("https://rahulshettyacademy.com");
		
		Landingpage l =new Landingpage(driver);
		l.getlogin().click();
		
		
		
		
		
	}
	

}
