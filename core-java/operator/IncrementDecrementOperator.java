
public class IncrementDecrementOperator{
	// static or instance variable
	
	//method
	public static void main(String args[]){
		// local variable
		int a = 25; 
		int b = 5;
		
		System.out.println(" ++a : " + (++a));// 26
		System.out.println(" --b : " + (--b)); //4
		System.out.println(" a ++ : " + (a++)); //26 -- 27
		System.out.println(" b -- : " + (b--)); // 4 -- 3
		
		System.out.println(" b : " + (b)); //3
		System.out.println(" a  : " + (a)); // 27
		
		int c = 10;
		int d  = c++ ;
		System.out.println("d : " + d ); // 10
		System.out.println("c++ : " + c); // 11
		
		int e = 10;
		int f  = e-- ;
		System.out.println("f : " + f ); // 10
		System.out.println("e-- : " + e); // 9
		

	}
}