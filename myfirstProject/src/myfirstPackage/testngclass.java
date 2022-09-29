package myfirstPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngclass {

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	
	
	@Test
	public void test()
	{
		System.out.println("Test");
	}
}
