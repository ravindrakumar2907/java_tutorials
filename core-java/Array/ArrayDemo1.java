public class ArrayDemo1{

	public static void main(String args[]){
	 
	 int a = 10;
	 System.out.println(a);
	 
	 int arr[] = {1,2,3,4,5,6,7};
	 System.out.println(arr);
	 
	 System.out.println("Reading Array Values");
	 for(int index = 0; index < 7; index++){
		 System.out.println("Array Index: " + index + " Array Value: " + arr[index]);
	 }
	 // Reverse
	 // 6, 5, 4, 3, 2, 1, 0
	 System.out.println("Reverse Array Values");
	 for(int index = 6; index >= 0; index--){
		 System.out.println("Array Index: " + index + " Array Value: " + arr[index]);
	 }
	 
	 
	 String months[] = {"Jan", "Feb", "March", "April", "May", "June", "Jul", "Aug", "Sep", "Oct",
	 "Nov", "Dec"};

	 
	 for(int index = 0; index < 12; index++){
		 System.out.println("Array Index: " + index + " Array Value: " + months[index]);
	 }

	}
}