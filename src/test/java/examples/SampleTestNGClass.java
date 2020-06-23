package examples;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class SampleTestNGClass {
    private WebDriver driver;		

	
  @Test
  public void f() {
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();	
		System.out.println(title);
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		

  }
  @BeforeTest(alwaysRun=true)
  public void beforeTest() {
	  System.out.println("driver initialisation");
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\eclipse-workspace\\TestNGProject\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();  

  }

  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  System.out.println("after all classes");
		driver.quit();			

  }
  
  @BeforeClass(alwaysRun=true)
  public void sampleClassMethod() {
System.out.println("sample before class");
}
  
  @AfterClass(alwaysRun=true)
  public void sampleAfterClassMethod() {
System.out.println("sample after class");
  }

}
