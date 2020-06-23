package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	public WebDriver driver;
	  @Parameters("browser")

	  @BeforeClass
	  public void beforeTest(String browser) {
		  if(browser.equalsIgnoreCase("firefox")) {
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\my\\eclipse-workspace\\TestNGProject\\Drivers\\geckodriver.exe");
			  driver = new FirefoxDriver();	  
		  }else if (browser.equalsIgnoreCase("chrome")) { 
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\eclipse-workspace\\DemoProjects\\Drivers\\chromedriver.exe");
			  driver = new ChromeDriver();
	  }
		  driver.get("https://www.facebook.com/"); 
	  }
	  
	  @Test
	  public void login() throws InterruptedException {
		  /*Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();*/
		  driver.findElement(By.id("email")).sendKeys("geethapriyababu@gmail.com");
		 System.out.println("username entered");
	  }
	  
	  @Test
	  public void loginPassword() {
driver.findElement(By.id("pass")).sendKeys("anusombu@2016");
System.out.println("password entered");
	}
	  
	  @AfterClass
	  public void afterTest() {

			driver.quit();

		}
}
