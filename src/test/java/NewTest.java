import java.io.File;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.logging.Level;
import java.util.List;

public class NewTest {
	
	
	
	
	
	 @Test
	 public void test01() {
		 
	//	 By user_name = By.xpath("//coderz-input[@id=\"login_username\"]/div/div/div[2]/input");
		 
		 try {
			 
			 System.setProperty("webdriver.chrome.com", "D:\\chromedriver\\chromedriver.exe");
			 
			 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			 LoggingPreferences loggingPreferences = new LoggingPreferences();
			 
			 
			 loggingPreferences.enable(LogType.DRIVER, Level.ALL);
			 capabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingPreferences);
			 
			 URL url = new URL("http://localhost:4444/wd/hub");
			 //URL url = new URL("http://192.168.99.100:4444/wd/hub");
			 
		 	 
			 RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);
		 	  
		 	  
		 	  
		 	  driver.get("https://www.google.com/");
		 	  
		 	 Thread.sleep(10000);
		 	  
		 	  driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("aaa");
		 	  
		 	  
		 	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 	
		 	FileUtils.copyFile(scrFile, new File("C:\\EclipseScreenshot\\screenshot.png"));
		 	
		 	  
		 //	 (new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOfElementLocated(user_name));
		 	  
		 	  long id = Thread.currentThread().getId();
		 	  System.out.println(" Thread number for test01 is " + id);
		 	  
		 	  
		 	
		 	// LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
		 	 
			
		        
				
//			 for (int i = 0; i < logs.size(); i++) {
//			 System.out.println(logs.get(i).getLevel().toString() + " " +
//			 logs.get(i).getMessage());
//			
//			 }
//			
//			 if (logs.size() == 0) {
//			 System.out.println("No logs found");
//			 }
			 
			 
		 	 driver.quit();
			 
			 System.out.println("hellow world");
			 
			 
		 }catch (Exception e){
			 
			 e.printStackTrace();
			 
		 }
	 	  
	 	  
	   }
	 
//	 @Test
//	 public void test02() {
//		 
//	//	 By user_name = By.xpath("//coderz-input[@id=\"login_username\"]/div/div/div[2]/input");
//		 
//		 try {
//			 
//			 System.setProperty("webdriver.chrome.com", "D:\\chromedriver\\chromedriver.exe");
//		 	  
//              DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//			 
//			// URL url = new URL("http://localhost:4444/wd/hub");
//			 URL url = new URL("http://192.168.99.100:4444/wd/hub");
//		 	 
//			 RemoteWebDriver driver = new RemoteWebDriver(url, capabilities);
//			 
//		 	  driver.get("https://www.google.com/");
//		 	  
//		 	  Thread.sleep(10000);
//		 	  
//		 	  driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("aaa");
//		 	  
//		 	  
//		 	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		 	
//		 	FileUtils.copyFile(scrFile, new File("C:\\EclipseScreenshot\\screenshot.png"));
//		 	
//		 	  
//		 //	 (new WebDriverWait(driver, 20)).until(ExpectedConditions.visibilityOfElementLocated(user_name));
//		 	  
//		 	  long id = Thread.currentThread().getId();
//		 	  System.out.println(" Thread number for test02 is " + id);
//		 	  driver.quit();
//			 
//			 System.out.println("hellow world");
//			 
//			 
//		 }catch (Exception e){
//			 
//			 e.printStackTrace();
//			 
//		 }
//	 	  
//	 	  
//	   }
	 
	 
}
