package examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	@Test(groups= {"bonding"})
	public void testCase1() {

		System.out.println("This is the A Normal Test Case");

	}
	
	@Test (priority = 1)
	public void b_method() {

		System.out.println("This is B method");

	}
	
	@Test (priority = 1)
	public void a_method() {

		System.out.println("This is A method");

	}
	
	@Test
	public void d_method() {
		System.out.println("This is D Method");
	}
	
	@Test
	public void c_method() {
		System.out.println("This is C Method");
	}


	@BeforeMethod(alwaysRun=true)

	public void beforeMethod() {

		System.out.println("This will execute before every Method");

	}

	@AfterMethod(alwaysRun=true)

	public void afterMethod() {

		System.out.println("This will execute after every Method");

	}

	@BeforeClass(alwaysRun=true)

	public void beforeClass() {

		System.out.println("This will execute before the Class");

	}

	@AfterClass(alwaysRun=true)

	public void afterClass() {

		System.out.println("This will execute after the Class");

	}

	@BeforeTest(alwaysRun=true)

	public void beforeTest() {

		System.out.println("This will execute before the Test");

	}

	@AfterTest(alwaysRun=true)

	public void afterTest() {

		System.out.println("This will execute after the Test");

	}

	@BeforeSuite(alwaysRun=true)

	public void beforeSuite() {

		System.out.println("This will execute before the Test Suite");

	}

	@AfterSuite(alwaysRun=true)

	public void afterSuite() {

		System.out.println("This will execute after the Test Suite");

	}

}
