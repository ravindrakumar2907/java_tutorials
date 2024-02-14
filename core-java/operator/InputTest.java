import java.util.Scanner;  // Import the Scanner class

public class InputTest {
	
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
	
	System.out.println("Enter Password");
	String password = myObj.nextLine();  // Read user input
    System.out.println("password is: " + password);  // Output user input
  }
}

/*class MyInput{
	
	public String getKeyboardInput(){
		return "hello";
	}
	
}
MyInput obj = new MyInput();
obj.getKeyboardInput()

*/

1. write an program which takes all the input like
1. firstName
2. lastName
3. dob
4. age
5. address
6. email
7. password

2. Write a program for calculator
1. first Value
2. second value
3. operator (Arithmatci) add +, sub -
