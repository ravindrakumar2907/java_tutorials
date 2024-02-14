
public class SwichDemo{

	public static void main(String args[]){
		final String red = "red";
		final String blue = "blue";
		final String white = "white";
		final String black = "black";
		String color = null;// new 
		
		color = "red";
		// break
		switch(color){
			case red:
				System.out.println("Red color");
				break;
				
			case blue:
				System.out.println("blue color");
				break;
			
			case white:
				System.out.println("white color");
				break;
			
			case black:
				System.out.println("black color");
				break;
				
			default:
				System.out.println("No color matched");
				break;
				
		}
		
		
	}
}