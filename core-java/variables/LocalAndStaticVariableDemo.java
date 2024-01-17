public class LocalAndStaticVariableDemo{

	//static variable
	static String name = "Ravindra";
	static String email = "xyz@gmail.com";
	
	public static void main(String args[]){
		//local variable
		String name = "ravi";
		String email = "abc@gmail.com";
		System.out.println("Name: " + name + " email: " + email);
		
		//Object way
		LocalAndIntanceVariableDemo d = new LocalAndIntanceVariableDemo();
		System.out.println("Name: " + d.name + " email: " + d.email);
		
		//class way
		System.out.println("Name: " + LocalAndIntanceVariableDemo.name + " email: " + LocalAndIntanceVariableDemo.email);
		
	}
	
}