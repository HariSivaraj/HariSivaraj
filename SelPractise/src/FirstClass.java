import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	
	private void endpoint() {
		System.out.println("THis class finished its duty by calling this function");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\HVNSpace\\JavaPractice\\chromedriver_win32\\chromedriver.exe");
		WebDriver brDriver = new ChromeDriver();
		//brDriver.get("https://login.salesforce.com/?locale=in");
		brDriver.get("https://facebook.com");
		brDriver.manage().window().maximize();
//		brDriver.get("https://www.policybazaar.com");
//		//		FirstClass fc = new FirstClass();
//		fc.endpoint();
//		brDriver.findElement(By.cssSelector("i.arrow")).click();
//		brDriver.wait(12);
//		string str = 
//		brDriver.findElement(By.cssSelector("i.arrow")).click();
		
		brDriver.findElement(By.cssSelector("input#email.inputtext.55r1._6luy")).sendKeys("salesforceLOgin");
		brDriver.findElement(By.cssSelector("input.inputtext.55r1._6luy")).sendKeys("salesforceLOgin");
		
		//div[@class='login-module-container fade-and-drop']/div/div[2]/div/div/div[4]/input
	}
}
