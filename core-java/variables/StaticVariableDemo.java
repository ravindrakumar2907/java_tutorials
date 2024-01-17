public class StaticVariableDemo{

	// instance variables
	String name = "Deepak";
	String email = "deepak@gmail.com";
	
	//shared resouces
	static String mobileNumber = "1234567890";
	static String address = "Xyz, nagpur, Mh";
	
	public static void main(String args[]){
		// static variable access using direct method (name)
		System.out.println("mobileNumber: " + mobileNumber + " address: " + address);
		
		// static variable access using Object 
		StaticVariableDemo demo = new StaticVariableDemo();
		System.out.println("mobileNumber: " + demo.mobileNumber + " address: " + demo.address);
		
		demo.printing();
		
		//static variable access using className
		System.out.println("mobileNumber: " + StaticVariableDemo.mobileNumber + " address: " + StaticVariableDemo.address);
		
	}
	
	// static method
	public static void sum(){
		// local variables
		int a = 10;
		int b= 10;
		System.out.println(a + b);
	}
	
	//instance method
	public void printing(){
		System.out.println("Name: " + name + " email: " + email);
		System.out.println("mobileNumber: " + mobileNumber + " address: " + address);
	}
}

/***
D:\java\core>javac StaticVariableDemo.java
StaticVariableDemo.java:16: error: cannot find symbol
                System.out.println("mobileNumber: " + demo.mobileNumber + " address: " + demo.address);
                                                          ^
  symbol:   variable mobileNumber
  location: variable demo of type InstanceVariableDemo
StaticVariableDemo.java:16: error: cannot find symbol
                System.out.println("mobileNumber: " + demo.mobileNumber + " address: " + demo.address);
                                                                                             ^
  symbol:   variable address
  location: variable demo of type InstanceVariableDemo
2 errors

*/