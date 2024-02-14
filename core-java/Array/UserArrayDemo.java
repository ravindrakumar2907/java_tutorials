
/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
        at UserArrayDemo.main(UserArrayDemo.java:20)


*/

public class UserArrayDemo{
	
	public static void main(String args[]){
		User user[] = new User[2]; // array of user 0,1
		
		User u1 = new User(); // object creation
		u1.name = "Ravi"; // calling instance variable and assingment
		u1.rollNumber = 101;
		
		User u2 = new User();
		u2.name = "Mahesh";
		u2.rollNumber = 102;
		
		//storing in user array
		user[0] = u1;
		user[1] = u2;
		
		for(int i = 0; i < 2; i++){
			User u = user[i]; // getting user from array
			//System.out.println("Name: " + u.name + " rollNumber: " + u.rollNumber);
			u.print();
		}
	}
	
}

class User{
	String name;
	int rollNumber;
	
	public void print(){
		System.out.println("User name: " + this.name + " rollNumber: " + this.rollNumber);
	}
	// this points to current object
}