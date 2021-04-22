package frameworkdemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignment6_q4 {
	
	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("In before suite");
	  }
	  
	  
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("In before test");
	  }
	  
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("In before class");
	  }
	  
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("In before method");
	  }
	
	  @Test
	  public void testCase1() {
		  System.out.println("In test case 1");
	  }
	  
	  @Test
	  public void testCase2() {
		  System.out.println("In test case 2");
	  }
  
  
	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("In after method");
	  }
	  
	  @AfterClass
	  public void afterClass() {
		  System.out.println("In after class");
	  }
  
	  @AfterTest
	  public void afterTest() {
		  System.out.println("In after test");
	  }
  
	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("after suite");
	  }
  
  
  
}
