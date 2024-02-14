/*
Printing the Array and length
*/
public class ArrayDemo3{
	
	public static void main(String args[]){
		String str[] = {"Ravi", "Mahesh", "Pratik"};
		
		int len = str.length;
		for(int i =0; i < len; i++){
			System.out.println(str[i]);// access the 
		}
		
		System.out.println("Length: " + str.length);
		
	}
}