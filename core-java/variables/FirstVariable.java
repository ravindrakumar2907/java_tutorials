
public class FirstVariable{
	// variables
	int a = 10;
	static String name = "XYZ";
	
	public static void main(String a[]){
		FirstVariable d = new FirstVariable();
		int temp = d.a;
		d.print(temp);
		
		
		// static 
		// 1. direct  object, class name
		d.print(name);
		d.print(d.name);
		d.print(FirstVariable.name);
		
	}
	
	void print(int data){
		System.out.println("data: " + data);
	}
	
	void print(String data){
		System.out.println("data: " + data);
	}

}
