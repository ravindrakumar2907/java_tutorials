
public class MulArrayDemo{

	public static void main(String args[]){
		int a[][] = new int [3][3]; // array creation declar + ini.
		/*
		1 2 3
		4 5 6
		7 8 9
		*/
		
		// Assing emnt
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;
		System.out.println("Printing Matrix form Array elements");
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(" " +a[i][j]);
			}
			System.out.println();
		}
			
	}
}