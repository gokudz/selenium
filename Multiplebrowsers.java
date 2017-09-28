package datadriventestNG;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

// KEY WORD  DRIVEN

@SuppressWarnings("unused")
public class Multiplebrowsers {
	public WebDriver driver = null;
	 
	@Test 
	public void login() throws Exception{
		
	// when we want data globally without hardcoded  than we have to use the properties	
	Properties prop = new Properties();
	
	// this FileInputStream will point the the place exactly where the file lies by a path provided as argument
	FileInputStream fis = new FileInputStream("C:\\Users\\Sai Tharun\\.eclipse\\New folder\\datadriventestNG\\src\\datadriventestNG\\software.properties") ;
	
	// we need to integrate these two
	           prop.load(fis);
	           
	           
	  // if client asks to run al test cases on the chrome browser after 5 months than it is tough to change all test cases
	  // here we have solution for it
	       		
	  if(prop.getProperty("browser").equals("firefox"))
	  {
		  driver=new FirefoxDriver();
	  }
	  else if(prop.getProperty("browser").equals("chrome")) 
	  {
		  
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
	  }
//	  else{
//		  driver = new InternetExplorerDriver();
//	  }
//	  
//	
	  //driver.get(prop.getProperty("url"));
	  //driver.get(prop.getProperty("url"));
	 System.out.println(prop.getProperty("username"));
	 System.out.println(prop.getProperty("browser"));
	 System.out.println(prop.getProperty("url" ));
	 
	}
	
	
	
}
