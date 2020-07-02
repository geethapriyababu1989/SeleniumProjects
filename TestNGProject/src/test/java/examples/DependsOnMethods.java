package examples;

import org.testng.annotations.Test;

public class DependsOnMethods {
	  @Test 
	  public void SignIn() {
		  System.out.println("This will execute second (SignIn)");
	  }

	  @Test
	  public void OpenBrowser() {
		  System.out.println("This will execute first (Open Browser)");
	  }
	  
	  @Test (dependsOnMethods = { "SignIn","OpenBrowser" })
	  public void LogOut() {
		  System.out.println("The user logged out successfully");
	  }


}
