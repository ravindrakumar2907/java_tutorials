/*
Printing the Array and length
*/
public class ArrayDemo6{
	
	public static void main(String args[]){
		int str[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		long startTime = System.currentTimeMillis();
		System.out.println("Start time: "+ startTime);
		int len = str.length;
		for(int i =0; i < str.length; i++){
			System.out.println(str[i]);// access the 
		}
		
		
		System.out.println("Total time take in MiliSecond: " + (System.currentTimeMillis() - startTime));
		System.out.println("Length: " + str.length);
		
	}
}

//Total time take in MiliSecond: 31  with len variable
