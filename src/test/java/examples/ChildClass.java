package examples;

import org.testng.annotations.Test;

public class ChildClass extends DependsOnMethods {
  @Test(dependsOnMethods= {"LogOut"})
  public void f() {
	  System.out.println("this is child class");
  }
}
