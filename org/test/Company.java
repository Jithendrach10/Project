package org.test;
                     //static is access modifier
                     //static obtain for method, variable.
                     
public class Company {
	
  public static void method1Static() {
	  System.out.println("company name is hcl");
  }
     public static void method2() {
		System.out.println("hcl is one of the best company");

	}
     
   public static void main(String[] args) {
	  
	   method1Static();     //without object we can call static method by method name.
	   method2();
}
}