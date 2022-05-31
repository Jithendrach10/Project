package org.test;

public class Company2 extends Company {
   public void compName() {
	System.out.println("tcs");

}
   public void compArea() {
	System.out.println("hyd");

}
   public static void main(String[] args) {
	   Company2 nb = new Company2();
	   nb.compName();
	   nb.compArea();             // obtain static in same package only
        Company.method1Static(); // by className.methodName we can call different class static method 
        Company.method2();
	  
}
}
