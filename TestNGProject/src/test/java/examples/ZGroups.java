package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ZGroups {

	public static WebDriver webDriver;

	String launchPageHeading = "//h3[text()='Guru99 Bank']";
	final String userName_element = "//input[@name='uid']", password_element = "//input[@name='password']",
			signIn_element = "//input[@name='btnLogin']";
	final String userName_value = "mngr266351", password_value = "nAmadyg";
	final String managerID = "//td[contains(text(),'Manger Id')]";
	final String newCustomer = "//a[@href='addcustomerpage.php']", fundTransfer = "//a[@href='FundTransInput.php']";

	@Test(groups = {"bonding","strong_ties" })
	public void tc01LaunchURL() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my\\eclipse-workspace\\TestNGProject\\Drivers\\chromedriver.exe");
		webDriver= new ChromeDriver();;
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		webDriver.get("http://www.demo.guru99.com/V4/");
	}

	@Test(groups = { "bonding to" })
	public void tc02VerifyLaunchPage() {
		/*Assert.assertTrue(webDriver.findElement(By.xpath(launchPageHeading)).isDisplayed(),
				"Home Page heading is not displayed");*/
		System.out.println("Home Page heading is displayed");
	}

	@Test(groups = { "bonding and", "strong_ties" })
	public void tc03EnterCredentials() {
		webDriver.findElement(By.xpath(userName_element)).sendKeys(userName_value);
		webDriver.findElement(By.xpath(password_element)).sendKeys(password_value);
		webDriver.findElement(By.xpath(signIn_element)).click();
	}

	@Test(groups = { "strong_ties" })
	public void tc04VerifyLoggedInPage() {
		Assert.assertTrue(webDriver.findElement(By.xpath(managerID)).isDisplayed(),
				"Manager ID label is not displayed");
		System.out.println("Manger Id label is displayed");
	}

	@Test(groups = { "bonding with" })
	public void tc05VerifyHyperlinks() {
		Assert.assertTrue(webDriver.findElement(By.xpath(newCustomer)).isEnabled(),
				"New customer hyperlink is not displayed");
		System.out.println("New customer hyperlink is displayed");

		Assert.assertTrue(webDriver.findElement(By.xpath(fundTransfer)).isEnabled(),
				"Fund Transfer hyperlink is not displayed");
		System.out.println("Fund Transfer hyperlink is displayed");
		System.out.println("Git push");
		webDriver.close();
	}

}
