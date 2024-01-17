public class LocalAndIntanceVariableDemo{

	//instance variable
	String name = "Ravindra";
	String email = "xyz@gmail.com";
	
	
	public static void main(String args[]){
		//local variable
		String name = "ravi";
		String email = "abc@gmail.com";
		System.out.println("Name: " + name + " email: " + email);
		
		LocalAndIntanceVariableDemo d = new LocalAndIntanceVariableDemo();
		System.out.println("Name: " + d.name + " email: " + d.email);

		
	}
	
}