
/* This is variable program
1. Local Variable- inside the method
2. static variable- inside the class but outside the method and have static keyword.
3. Instance Variable- inside the class but outside the method and does not have static keyword.
*/

public class VariableDemo2{
	//Instance / object Variable
	String name = "XYZ";
	int age = 20;
	
	//static variable
	static int count = 0; // static works as global
	
	
	public static void main(String a[]){
		int b = 10;
		int c = 20;
		System.out.println("This is variable program");
		
		VariableDemo2 obj1 = new VariableDemo2();
		System.out.println("obj1 address: " + obj1.toString());
		System.out.println("name: " + obj1.name + " age:" + obj1.age + "\n");
		
		VariableDemo2 obj2 = new VariableDemo2();
		System.out.println("name: " + obj2.name + " age:" + obj2.age);
		obj2.name = "Ravi";
		obj2.age = 74;
		System.out.println("obj2 address: " + obj2.toString());
		System.out.println("name: " + obj2.name + " age:" + obj2.age);
		
		System.out.println("obj1 address: " + obj1.toString());
		System.out.println("name: " + obj1.name + " age:" + obj1.age + "\n");
		

		System.out.println("obj2 address: " + obj2.toString());
		System.out.println("name: " + obj2.name + " age:" + obj2.age);
		
		// static variable access
		System.out.println("static variable: " + count);
		obj1.count = 2;
		System.out.println("static variable: " + count);
		obj2.count = 4;
		System.out.println("static variable: " + count);
		System.out.println("static variable: " + obj1.count);
		System.out.println("static variable: " + VariableDemo2.count);
		
	}
	
	public void print(){
		System.out.println("name: " + name + " age:" + age + "\n");
	}

}

/*

VariableDemo2.java:16: error: non-static variable name cannot be referenced from a static context
                System.out.println("name: " + name + " age:" + age);
				
				
obj1 address: VariableDemo2@70beb599
name: XYZ age:20

obj2 address: VariableDemo2@62fdb4a6
name: XYZ age:20
*/