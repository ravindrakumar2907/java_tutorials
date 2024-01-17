public class InstanceVariableDemo{

	// instance variables
	String name = "Deepak";
	String email = "deepak@gmail.com";
	
	public static void main(String args[]){
		// Object creation
		InstanceVariableDemo demo = new InstanceVariableDemo();
		System.out.println("This is local variable demo");
		//instance variable access
		System.out.println("Name: " + demo.name + " email: " + demo.email);
		sum(); // static method calling
		demo.printing(); // instance method calling
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
	}
}

/***
InstanceVariableDemo.java:10: error: non-static variable name cannot be referenced from a static context
                System.out.println("Name: " + name + " email: " + email);
                                              ^
InstanceVariableDemo.java:10: error: non-static variable email cannot be referenced from a static context
                System.out.println("Name: " + name + " email: " + email);

*/