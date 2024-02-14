import java.util.Scanner; 
public class Cal{

	public static void main(String args[]){
		print("Calculator Program.");
		
		processInput();
	}
	
	public static void processInput(){
		Cal c = new Cal();
		print("Enter the first Value.");
		String firstValue = c.getUserInput();
		print("Enter the Second Value.");
		String secondValue = c.getUserInput();
		print("First Value: " + firstValue + " , secondValue : " + secondValue);
		printAllOperations();
		String opCode = c.getUserInput();
		print("Your OpCode is= " + opCode);
		String result = performCal(opCode, firstValue, secondValue);
		print("The result is: " + result);
		
		print("Do you want to continue. y / n ?");
		String userIn = c.getUserInput();
		if(userIn.equals("y")){
			processInput();
		}else{
			print("Exited.");
		}
	}
	
	public static void print(String msg){
		System.out.println("\n" + msg);
	}
	
	public String getUserInput(){
		Scanner myObj = new Scanner(System.in); 
		String value = myObj.nextLine();
		return value;
	}
	
	public static void printAllOperations(){
		print("Enter the Operation Code from following list.");
		System.out.println("\n Code 1 Add");
		System.out.println("\n Code 2 Sub");
		System.out.println("\n Code 3 Mul");
		System.out.println("\n Code 4 Div");
		System.out.println("\n Code 5 Exit");
	}
	
	public static String performCal(String opCode, String firstValue, String secondValue){
		String result = "";
		if(opCode.equals("1")){ // opCode == 1
			result = sum(firstValue, secondValue);
		}else if(opCode.equals("2")){
			result = sub(firstValue, secondValue);
		}else if(opCode.equals("3")){
			result = mul(firstValue, secondValue);
		}else if(opCode.equals("4")){
			result = div(firstValue, secondValue);
		}else if(opCode.equals("5")){
			print("The OpCode for exit and exiting the program");
			System.exit(0);
		}else{
			print("The OpCode is not valid.");
			return result;
		}
		return result;
	}
	
	public static String sum(String firstValue, String secondValue){
		print("Sum method");
		return "" + (Integer.parseInt(firstValue) + Integer.parseInt(secondValue));
	}
	public static String sub(String firstValue, String secondValue){
		print("sub method");
		return "" + (Integer.parseInt(firstValue) - Integer.parseInt(secondValue));
	}
	public static String mul(String firstValue, String secondValue){
		print("mul method");
		return "" + (Integer.parseInt(firstValue) * Integer.parseInt(secondValue));
	}
	public static String div(String firstValue, String secondValue){
		print("div method");
		return "" + (Integer.parseInt(firstValue) / Integer.parseInt(secondValue));
	}
}



/*
1. Write a program to take the input for all subject and check if user is passed or not.
==> subject-marks as input
==> User is passed or failed. print the percentage.


2. Take a number as input and print if the number is valid or not.

conditions-> 
1. number not blank
2. number eqals to 10, number 12 digit 91

*/
