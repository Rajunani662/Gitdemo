package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {
	public WebDriver driver;
	public WebDriver initilizerDriver() throws IOException
	{
		
		Properties pro=new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Martha Raju\\eclipse-workspace\\yuvi\\src\\main\\java\\resources\\data.properties");
		pro.load(fis);
		String browsername= pro.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("Webdriver.chrome.driver","C:\\Users\\Martha Raju\\Desktop");
			 driver= new ChromeDriver();
			 System.out.println("raju");
		}
		else if(browsername=="Firefox"){
			driver=new FirefoxDriver();
			
			
			 
		}
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return driver;
	
	}


}
