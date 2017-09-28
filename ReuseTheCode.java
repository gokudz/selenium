package datadriventestNG;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
// BY extending this class with inheritance we can use this in any class to invoke the browser
public class ReuseTheCode {
	public WebDriver driver = null;
	 
	@Test 
	public void login() throws Exception{
		
	
	Properties prop = new Properties();
	
	
	FileInputStream fis = new FileInputStream("C:\\Users\\Sai Tharun\\.eclipse\\New folder\\datadriventestNG\\src\\datadriventestNG\\software.properties") ;
	
	
	           prop.load(fis);
	           
	           
	  
	       		
	  if(prop.getProperty("browser").equals("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  else if(prop.getProperty("browser").equals("chrome")) 
	  {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();

	 System.out.println(prop.getProperty("username"));
	 System.out.println(prop.getProperty("browser"));
	 System.out.println(prop.getProperty("url"));
	 
	}
	}
}
