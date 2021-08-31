package Folder02;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Folder02.Class01;
public class Class01 {

@Test
public void method01(){
	System.out.println("I am from"+ Class01.this);
}

@BeforeMethod
public void method02(){
	System.out.println("I am from"+ Class01.this);
}
@Test(dependsOnMethods="method04")
public void method03(){
	System.out.println("I am from"+ Class01.this);
}

@Test(dependsOnMethods="method01")
public void method04(){
	System.out.println("I am from"+ Class01.this);
}
}

