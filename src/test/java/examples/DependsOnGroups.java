package examples;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnGroups {
  /*  @Test(dependsOnGroups = { "Inside" })
    public void ViewAcc() {
        System.out.println("SignIn Successful");
    }
 
    @Test(groups = { "Inside" })
    public void LogIn() {
        System.out.println("Logging In Success");
    }
    
    @Test(groups = { "Inside" })
    public void OpenBrowser() {
        System.out.println("Browser Opened Successfully");
    }
*/

    @Test(groups = { "viewacc" })
    public void ViewAcc() {
        System.out.println("View Your Dashboardd");
    }
 
    @Test(groups = { "openbrowser" })
    public void OpenBrowser() {
        System.out.println("Browser Opened Successfully");
    }
 
    @Test(groups = { "login" })
    public void LogIn() {
    	Reporter.log("trying reports");
        System.out.println("Login Into The Account");
    }
    
    @Test(groups = {"logout"})
    public void CloseAccount() {
    	System.out.println("Closing The Account");
    }
    
	
}
