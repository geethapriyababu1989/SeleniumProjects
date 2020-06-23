package examples;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP {
	  @Test (dataProvider = "dp", dataProviderClass=DataProviders.class)
	    public void myTest (String val) {
	        System.out.println("Current Status : " + val);
	    }

		@DataProvider (name = "data-provider")
		public Object[][] dpMethod(){
			return new Object[][] {{2, 3 , 5}, {5, 7, 12}};
		}
		
		  @Test (dataProvider = "data-provider")
		    public void myTest (int a, int b, int result) {
		        int sum = a + b;
		        Assert.assertEquals(result, sum);
		        
		        Reporter.log("something");
		        Reporter.log("super", true);
		        Reporter.log("dont know", 1);
		        Reporter.log("dont know", 1, true);
		    }

}
