/*
Printing the Array and length
*/

import java.util.Scanner;

public class ArrayDemo4{
	static String str[] ;
	
	public static void main(String args[]){
		int len = Integer.parseInt(args[0]);// static method calling
		str = new String[len];// giving array size
		System.out.println("Length: " + str.length);
		
		for(int i =0; i < len; i++){
			String element = fillArray(i);
			str[i] = element;
		}
		
		System.out.println("Length: " + str.length);
		
		System.out.println("Printing elements");
		for(int i =0; i < len; i++){
			System.out.println(str[i]);
		}
		
	}
	
	private static String fillArray(int position){
		System.out.println("Enter the Array "+ position + " Element");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine(); // instance method calling
	}
}