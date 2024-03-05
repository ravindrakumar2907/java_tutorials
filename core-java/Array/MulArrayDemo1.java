
import java.util.Scanner;
//import java.util.*; all
public class MulArrayDemo1{

	public static void main(String args[]){
		int a[][] = new int [3][3]; // array creation declar + ini.
		/*
		1 2 3
		4 5 6
		7 8 9
		*/
		System.out.println("Input Matrix form Array elements");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				a[i][j] = getInput();
			}
			System.out.println();
		}
		
		System.out.println("Printing Matrix form Array elements");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(" " +a[i][j]);
			}
			System.out.println();
		}
			
	}
	
	public static int getInput(){
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
}