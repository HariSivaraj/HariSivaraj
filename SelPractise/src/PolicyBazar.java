
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PolicyBazar {
	
	private void endpoint() {
		System.out.println("THis class finished its duty by calling this function");
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\HVNSpace\\JavaPractice\\chromedriver_win32\\chromedriver.exe");
		WebDriver brDriver = new ChromeDriver();
		brDriver.get("https://"zenhabits.net/");
		brDriver.manage().window().maximize();
		//brDriver.findElement(By.cssSelector("a[class='sign-in']")).click();
		brDriver.findElement(By.xpath("//div[class='prd-block']/a/div/p")).click();
		brDriver.findElement(By.linkText("breathe")).click();
		brDriver.findElement(by.)
	}
}
""