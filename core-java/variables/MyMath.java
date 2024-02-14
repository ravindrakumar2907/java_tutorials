
// This is math class for basic math functions / methods
public class MyMath{

	public int sum(int a , int b){
		return a + b;
	}
	
	public int sub(int a , int b){
		return a - b;
	}
	
	public int mul(int a , int b){
		return a * b;
	}
	
	public int div(int a , int b){
		return a / b;
	}
	
	public static void main(String a[]){
		MyMath math = new MyMath();
		int result = math.sum(2, 5);
		System.out.println("result = " + result);
	}
}
