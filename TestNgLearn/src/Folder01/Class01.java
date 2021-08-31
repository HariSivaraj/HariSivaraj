package Folder01;

import org.testng.annotations.Test;

public class Class01 {
	
	@Test
	public void method01(){
		System.out.println("I am from Class01.Method01"+ Class01.this);
	}

	@Test 
	public void method02(){
		System.out.println("I am from Class01.Method02"+ Class01.this);
	}
	@Test
	public void method03(){
		System.out.println("I am from Class01.Method03"+ Class01.this);
	}

public Object[][] userCredetials(){
	Object[] [] userCredential = new Object[2][2];
	userCredential[0][0]="hariv";
	userCredential[1][0]="hariv";
	
	userCredential[0][0]="hariv1";
	userCredential[1][0]="hariv1";
	return userCredential;
	
}
}