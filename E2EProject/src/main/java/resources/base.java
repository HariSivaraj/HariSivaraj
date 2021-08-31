package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\HVNSpace\\GitBucket2\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		//prop.getProperty("browser");
		if (prop.getProperty("browser").contains("chrome")){	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\hariv\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").contains("fox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\HVNSpace\\JavaPractice\\Sl_SupportFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if (prop.getProperty("browser").contains("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\HVNSpace\\JavaPractice\\Sl_SupportFiles\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
	}

}
