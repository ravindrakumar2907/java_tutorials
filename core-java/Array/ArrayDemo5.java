/*
Printing the Array and length
Array input via command line argument
*/


public class ArrayDemo5{
	
	public static void main(String args[]){
		int len = args.length;
		System.out.println("Length: " + len);
		System.out.println("Printing elements");
		for(int i =0; i < len; i++){
			System.out.println(args[i]);
		}
	}
}