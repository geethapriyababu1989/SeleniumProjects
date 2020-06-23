package examples;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersClass {
    @Test
    @Parameters ({"val1", "val2"})
    public void Sum(int v1, int v2) {
    	int finalsum = v1 + v2;
        System.out.println("The final sum of the given values is " + finalsum);
    }
    
    @Test
    @Parameters ({"val1", "val2"})
    public void Diff (int v1, int v2) {
    	int finaldiff = v1 - v2;
    	System.out.println("The final difference of the given values is " + finaldiff);
    }
    @Test
    @Parameters ("message")
    public void OP( @Optional("Optional Parameter Selected") String message) {
        System.out.println(message);
    }



}
