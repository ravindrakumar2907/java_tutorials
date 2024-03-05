
public class CreateNewFromExistingArrayDemo{
	
	public static void main(String args[]){
	
		int num[] = {1,2,3,4};
		int len = num.length;
		for(int i =0; i< len; i++){
			System.out.println(num[i]);
		}
		System.out.println("creating new Array Elements\n");
		// updating to add new element in the array
		
		int num1[] = new int[10];
		for(int i =0; i< len; i++){
			num1[i] = num[i];
		}
		
		// trying to add new element in the array
		num1[4] = 5;
		
		num1[9] = 14;
		
		len = num1.length;
		for(int i =0; i< len; i++){
			System.out.println(num1[i]);
		}
	
	}

}