package examples;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	
	@DataProvider(name="dp")
	public Object[][] dpMethod() {

		return new Object[][] {{"First-Value"}, {"Second-Value"}};

	}

    @Test (dataProvider = "dp")
    public void myTest (String val) {
        System.out.println("Passed Parameter Is : " + val);
    }


    @DataProvider (name = "data-provider")
	public Object[][] dpMethod (Method m){
    	String name = m.getName();
    	System.out.println(name);
		switch (m.getName()) {
		case "Sum": 
			return new Object[][] {{2, 3 , 5}, {5, 7, 12}};
		case "Diff": 
			return new Object[][] {{2, 3, -1}, {5, 7, -2}};
		}
		return null;
		
	}
	
	  @Test (dataProvider = "data-provider")
	    public void Sum (int a, int b, int result) {
	        int sum = a + b;
	        System.out.println("sum=" +sum);
	        Assert.assertEquals(result, sum);
	    }
	  
	  @Test (dataProvider = "data-provider")
	    public void Diff (int a, int b, int result) {
	        int diff = a - b;
	        System.out.println("diff="+diff);
	        Assert.assertEquals(result, diff);
	    }

    
}
