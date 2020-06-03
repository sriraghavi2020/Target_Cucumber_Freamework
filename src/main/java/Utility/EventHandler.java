package Utility;


	import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.events.WebDriverEventListener;

import Basic_Class.Test_BaseClass;
	 
	public class EventHandler extends Test_BaseClass implements WebDriverEventListener{
	 
	
	 public void beforeChangeValueOf(WebElement element, WebDriver driver) {
	 // TODO Auto-generated method stub
	 
	 System.out.println("Value of the:" + element.toString() + " before any changes made");
	 }
	 
	 public void afterChangeValueOf(WebElement element, WebDriver driver) {
		 // TODO Auto-generated method stub
		 
		 System.out.println("Element value changed to: " + element.toString());
		 }
	 public void beforeClickOn(WebElement element, WebDriver driver) {
	 // TODO Auto-generated method stub
	 System.out.println("Trying to click on: " + element.toString());
	 
	 }
	 
	 public void afterClickOn(WebElement element, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Clicked on: " + element.toString());
		 }
		 
	 public void beforeFindBy(By by, WebElement element, WebDriver driver) {
	 // TODO Auto-generated method stub
	 System.out.println("Trying to find element " + by.toString());
	 
	 }
	 
	 public void afterFindBy(By by, WebElement element, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Found Element using method " + by.toString());
		 }
	 
	 public void beforeNavigateForward(WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Before navigating forward to next page " + driver.getCurrentUrl());
		 
		 }
	 
	 public void afterNavigateForward(WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("After navigating forward to next page" + driver.getCurrentUrl());
		 }
		 
	 public void beforeNavigateTo(String url, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("Before navigating to " + url);
		 }
	 
		 public void afterNavigateTo(String url, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("After navigating to " + url);
		 }
	 public void beforeNavigateBack(WebDriver driver) {
	     // TODO Auto-generated method stub
	     System.out.println("Before navigating back to" + driver.getCurrentUrl());
	 
	     }
	 
	 public void afterNavigateBack(WebDriver driver) {
		 // TODO Auto-generated method stub
		 
		 System.out.println("After navigating back to " + driver.getCurrentUrl());
		 }  
	
	 
	 public void beforeScript(String script, WebDriver driver) {
	    // TODO Auto-generated method stub
	    System.out.println("Before the script " + script);
	    }
	 
	 public void afterScript(String script, WebDriver driver) {
		 // TODO Auto-generated method stub
		 System.out.println("After script is " + script);
		 }
		 
	 public void onException(Throwable error, WebDriver driver) {
	 // TODO Auto-generated method stub
	 System.out.println("Exception occured at " + error.getMessage());
	 
	 }

	@Override
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		// TODO Auto-generated method stub
		
	}
	 
	}


