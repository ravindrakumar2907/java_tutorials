public class User{
	// variables and method (function)
	
	public static void main(String str[]){
		// comments - single line
		/*  
		We need to learn class and object
		*/ 
		System.out.println("This  class A1 and printing some dummy data");
		User a = new User();// object creation
		a.sum(4, 5);
		System.out.println("After sum execution");
	}
	
	void sum(int a, int b){
		System.out.println(a+b);
	}
}

