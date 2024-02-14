public class ArrayDemo2{
	static int a[];// null
	
	public static void main(String args[]){
		int a[] = {1};
		
		System.out.println(a); // address
		System.out.println(ArrayDemo2.a); // null
		
	}
}
/*

ArrayDemo2.java:6: error: variable a might not have been initialized
                System.out.println(a);
                                   ^
1 error

*/
