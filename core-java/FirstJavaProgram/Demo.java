
public class Demo{

	public static void main(String args[]){
		String name = "Ravindra";
		String job = "IT";
		
		//System.out.println("Hello, "+ name + " you do the job in "+ job);
		
		/* */
		showNameAndJob(name, job);
		showNameAndJob("mahesh", "Student");
		showNameAndJob("Rahul", "Mechanic");
	}
	
	public static void showNameAndJob(String name, String job){
		System.out.println("Hello, "+ name + " you do the job in "+ job);
	}

}