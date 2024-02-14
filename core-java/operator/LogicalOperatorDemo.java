
public class LogicalOperatorDemo{

	public static void main(String args[]){
		
		String username = "ravi";
		String password = "123";
		
		/*
		if(!true){ // !
			System.out.println("This is boolean testing in if");
		}
		
		if(isEmpty(username) && isEmpty(password)){
			System.out.println("Please enter the username and password.");
			return;
			
		}
		*/
		
		if(isEmpty(username) && isEmpty(password)){
			System.out.println("Please enter the username and password.");
			return;
			
		}else{
			System.out.println("Going ahead to check the username and password validation with db.");
		}


		if(isEmpty(username) || isEmpty(password)){
			System.out.println("Please enter the username and password.");
			return;
			
		}else{
			System.out.println("Going ahead to check the username and password validation with db.");
		}

		
	}
	// new method
	public static boolean isEmpty(String str){
		boolean flag = false;
		
		if(str == ""){
			flag = true;
		}
		if(str == null){
			flag = true;
		}
		System.out.println("checking isEmpty for value : " + str + " flag: "+ flag);
		return flag;
		
	}
	
	
	
}