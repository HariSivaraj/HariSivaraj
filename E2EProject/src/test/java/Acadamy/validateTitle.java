package Acadamy;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

@Test
public class validateTitle extends base{
	public void basePageNavigation() throws IOException
	{
		driver = initializeDriver();
		driver.get("http://qaclickacadamy.com");
		LandingPage lp = new LandingPage(driver);
		//assert.assertEquals(lp.getTitle(), "title");
	
		System.out.println(lp.getTitle().getText());
		//assert.assertEquals(lp.getTitle().getText(), "Featured Courses");
		//assert.assertEquals(lp.getTitle().getText(), "fed");
	}

}
