
/*
byte = 0
short = 0
int = 0
long = 0
float = 0.0
double = 0.0
char = “u0000”.
boolean = false
String = null // object
deafultVariableValues = null

new DeafultVariableValues(); // DeafultVariableValues@6ce253f1
*/
public class DeafultVariableValues{
	static byte a;
	static short b;
	static int c;
	static long d;
	static float e;
	static double f;
	static char g;
	static boolean h;
	static String str;
	static DeafultVariableValues deafultVariableValues;// null
	static DeafultVariableValues deafultVariableValues1 = new DeafultVariableValues(); // object memory
	
	public static void main(String args[]){
		
		System.out.println("byte = " + a);
		System.out.println("short = " + b);
		System.out.println("int = " + c);
		System.out.println("long = " + d);
		System.out.println("float = " + e);
		System.out.println("double = " + f);
		System.out.println("char = " + g);
		System.out.println("boolean = " + h);
		System.out.println("String = " + str);
		System.out.println("deafultVariableValues = " + deafultVariableValues);
		System.out.println("deafultVariableValues1 = " + deafultVariableValues1);
	
	}
}
