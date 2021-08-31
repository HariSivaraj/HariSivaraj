package Acadamy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomPage extends base {
	public WebDriver driver;
		
	@Test(dataProvider="getData")
	public void basePageNavigation(String mail, String passcode) throws IOException
	{
		driver = initializeDriver();
		driver.get("qaclickacadamy.com");
		LandingPage lp = new LandingPage(driver);
		LoginPage lp1 = new LoginPage(driver);
		lp.getLogin().click();
		lp1.getEmail().sendKeys(mail);
		lp1.getPassword().sendKeys(passcode);		
	}
	
	//the following wont work; because dataprovider should be use Object[][] or Object[] or Iterator<Object[]> or Iterator<Object>, n
//	@Test(dataProvider="getName")
//	private void AAprintName(String name1) {
//		System.out.println(name1);
//	}
	
	@DataProvider
	public Object[][] getData()	{
		Object[][] data = new Object[2][2];
		data[0][0] = "hariom";
		data[0][1] = "spidermf";
		data[1][0] = "harivign";
		data[1][1] = "code2";
		return data;
		}
	
}
