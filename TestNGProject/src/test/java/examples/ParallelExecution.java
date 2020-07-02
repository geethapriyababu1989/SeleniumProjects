package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	public WebDriver driver;
	
  @Test
  public void chrome() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\eclipse-workspace\\DemoProjects\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println("this is the test related to chrome browserstack homepage"+ " " +Thread.currentThread().getId());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(2000);
		driver.quit();
		
}

  @Test
  public void firefox() throws Exception {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\my\\eclipse-workspace\\TestNGProject\\Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		System.out.println(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println("this is the test related to firefox browserstack homepage"+ " " +Thread.currentThread().getId());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("testing");
		Thread.sleep(2000);
		driver.quit();
}

}
