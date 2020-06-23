package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class ParallelMethods {
	public WebDriver driver;
	
/*	private void clickAnElementByLinkText(String id) {
	    WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
	    driver.findElement(By.id(id)).sendKeys("geetha");
	}
	
 @Test
  public void FirefoxTest() {	 
//Initializing the firefox driver (Gecko)
	 System.setProperty("webdriver.gecko.driver","C:\\Users\\my\\eclipse-workspace\\TestNGProject\\Drivers\\geckodriver.exe"); 
	 driver = new FirefoxDriver();	
	 System.out.println(driver);
	 System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	 driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com/"); 
	  clickAnElementByLinkText("email");
	  //WebElement f=driver.findElement(By.id("u_0_b"));
	//  WebDriverWait w=new WebDriverWait(driver,50);
	 // w.until(ExpectedConditions.presenceOfElementLocated(By.id("u_0_b")));
	  //f.click();
	  driver.quit();

  }
 
        @Test
 	public void ChromeTest()
 	{ 

	  //Initialize the chrome driver
        	 System.setProperty("webdriver.chrome.driver","C:\\Users\\my\\eclipse-workspace\\DemoProjects\\Drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println(driver);
		 System.out.println("The thread ID for Chrome is "+ Thread.currentThread().getId());
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.get("https://www.facebook.com/");
	  clickAnElementByLinkText("email");
	 // WebElement s=driver.findElement(By.id("u_0_b"));
	  //WebDriverWait w=new WebDriverWait(driver,50);
	  //w.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(s)));
	 //s.click();
	  driver.quit();

 	}
*/
	@Test()
	public void testOnChromeWithBrowserStackUrl() throws Exception
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\eclipse-workspace\\TestNGProject\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	System.out.println(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.browserstack.com/users/sign_up");
	//WebElement f = driver.findElement(By.xpath("//a[text()='Sign In']"));
	//f.click();
	//driver.findElement(By.id("user_email_login")).sendKeys("geethapriyababu@gmail.com");
	//driver.findElement(By.id("user_password")).sendKeys("asadfg");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
	driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh24@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("browserstack");
	System.out.println("this is the test related to chrome browserstack homepage"+ " " +Thread.currentThread().getId());
	Thread.sleep(2000);
	driver.quit();
	}

	@Test()
	public void testOnChromeWithBrowserStackSignUp() throws Exception
	{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\my\\eclipse-workspace\\TestNGProject\\Driver\\geckodriver.exe");
	driver=new FirefoxDriver();
	System.out.println(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.browserstack.com/users/sign_up");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_full_name")).sendKeys("Sadhvi Singh");
	driver.findElement(By.id("user_email_login")).sendKeys("sadhvisingh24@gmail.com");
	driver.findElement(By.id("user_password")).sendKeys("browserstack");
	System.out.println("this is the test related to firefox browserstack login"+ " " +Thread.currentThread().getId());
	Thread.sleep(2000);
	driver.quit();
	}

	
	
}
