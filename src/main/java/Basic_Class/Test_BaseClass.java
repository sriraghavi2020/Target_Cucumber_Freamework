package Basic_Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Utility.EventHandler;
import Utility.TestUtil;

public class Test_BaseClass {
 
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver FiringDriver;
	public static EventHandler handler;
	
	
	/*public Test_BaseClass() {
		try {
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream("C:\\Users\\Kiriti\\eclipse-workspace\\BDTest\\src\\main\\java\\config\\config.properties");
			prop.load(file);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	*/
	
	public static void initialization() {
		
		
			if(readPropsFile("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			FiringDriver = new EventFiringWebDriver(driver);
			handler = new EventHandler();
			FiringDriver.register(handler);
			driver = FiringDriver;
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.get(readPropsFile("URL"));
			
			
		
		
	}
	
	public static String readPropsFile(String readProp) {
		String propField = "";
		try {
			Properties prop = new Properties();
			FileInputStream file = new FileInputStream("C:\\Users\\Kiriti\\eclipse-workspace\\BDTest\\src\\main\\java\\config\\config.properties");
			prop.load(file);
		
			propField = prop.getProperty(readProp);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return propField;
		
	}
}
