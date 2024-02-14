
public class IfDemo{

	public static void main(String args[]){
		String red = "red";
		String blue = "blue";
		String white = "white";
		String black = "black";
		String color = "black";// new 
		
		//  use only for true
		if(red == blue){
			System.out.println("Matched colors.");
		}
		
		// use true as well as false
		if(red != null){
			System.out.println("paiting red");
		}else{
			System.out.println("Not a red color");
		}
		
		// use when you have more than 1 conditions
		if(color == white){
			System.out.println("paiting white");
		}else if(color == blue){
			System.out.println("paiting blue");
		}else if(color == black){
			System.out.println("paiting black");
		}else{
			System.out.println("Not macthing color");
		}
		
		
	}
}