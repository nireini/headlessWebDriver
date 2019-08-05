import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.Constant;

public class NewTest2 {
	
	
	
	//RemoteWebDriver driver; 
	WebDriver driver;
	
	@BeforeMethod
    public void setUp() throws MalformedURLException {
		
        System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        
        driver = new ChromeDriver(options);
       
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.BROWSER, Level.ALL);
        caps.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
		 
    }
	
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
    
    public void analyzeLog() {
        LogEntries logEntries = driver.manage().logs().get(LogType.BROWSER);
        for (LogEntry entry : logEntries) {
            System.out.println(new Date(entry.getTimestamp()) + " " + entry.getLevel() + " " + entry.getMessage());
            //do something useful with the data
        }
    }
    
    @Test
    public void testMethod() {
        driver.get("https://develop.gocoderz.com");
        
        
        analyzeLog();
    }

}
