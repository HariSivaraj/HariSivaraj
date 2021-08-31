package Folder02;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Class02 {
	
	@BeforeMethod
	public void method01(){
		System.out.println("I am from Class01.Method01 (@BeforeMethod)"+ Class02.this);
	}

	@BeforeTest
	public void method02(){
		System.out.println("I am from (@BeforeTest)"+ Class02.this);
	}

	@Test(description="this is desc")
	public void method03(){
		System.out.println("I am from"+ Class02.this);
		
	}
	@Test
	@Parameters({"name"})	
	public void method04(String who){
		System.out.println("I am from"+ Class02.this);
		System.out.println("Value of parameter" + who);
	
	}

}
