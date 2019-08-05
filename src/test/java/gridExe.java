import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridExe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities chromeDC = DesiredCapabilities.chrome();
		

		
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeDC);
		
		
		
		driver.get("https://google.com");
		
		
		Thread.sleep(10000);
		
		
		
		driver.quit();

	}

}
