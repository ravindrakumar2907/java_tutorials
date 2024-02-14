public class BitWiseOperators{

	public static void main(String args[]){
		int x = -6;
		int y = 4;
		System.out.println("The result of x&y= " + (x&y)); // 4
		
		System.out.println("The result of x|y= " + (x|y)); // 5
		
		System.out.println("The result of x^y= " + (x^y)); // 1
		
		// shifting
		System.out.println("The result of x<<y = " + (x << 2)); // left
		System.out.println("The result of x>>y = " + (y >> 2 )); // right
		
		System.out.println("The result of ~x = " + ~x ); // bitwise not
		
		System.out.println("The result of >>>x = "+ (x >>> 1) ); // bitwise not
	}
}