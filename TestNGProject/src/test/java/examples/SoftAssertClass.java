package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {
	
	WebDriver driver;
	
	@Test (priority = 0)
	public void CloseBrowser() {
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test (priority = -1)
	public void OpenBrowser() {
			Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\eclipse-workspace\\DemoProjects\\Drivers\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://www.demoqa.com");
	        SoftAssert softassert = new SoftAssert();
	        Reporter.log("The website used was DemoQA for this test", true);
	        String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        softassert.assertEquals(originalTitle, expectedTitle);
	        System.out.println("*** Checking For The Second Title ***");
// Checking title for ToolsQA � Demo Website to Practice Automation � Demo Website to Practice Automation
	        softassert.assertEquals(originalTitle, "ToolsQA � Demo Website to Practice Automation � Demo Website to Practice Automation" );
	        softassert.assertAll();
	        
	        
  }

}
