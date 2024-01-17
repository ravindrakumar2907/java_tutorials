public class LocalVariableDemo{

	public static void main(String args[]){
		String name = "Deepak";
		String email = "deepak@gmail.com";
		System.out.println("This is local variable demo");
		System.out.println("Name: " + name + " email: " + email);
		sum();
	}
	
	public static void sum(){
		int a = 10;
		int b= 10;
		System.out.println(a + b);
	}
}