
public class FixedArrayDemo{
	
	public static void main(String args[]){
	
		int num[] = {1,2,3,4};
		int len = num.length;
		for(int i =0; i< len; i++){
			System.out.println(num[i]);
		}
		System.out.println("Updating Elements\n");
		// updating to add new element in the array
		num[3] = 8;
		
		for(int i =0; i< len; i++){
			System.out.println(num[i]);
		}
		
		
		// trying to add new element in the array
		num[4] = 5;
		
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at FixedArrayDemo.main(FixedArrayDemo.java:20)

		
		*/
		
		len = num.length;
		for(int i =0; i< len; i++){
			System.out.println(num[i]);
		}
	
	}

}