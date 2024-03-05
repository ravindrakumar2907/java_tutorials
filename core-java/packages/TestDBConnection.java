import comt.flipkart.db.*;

public class TestDBConnection{

	public static void main(String args[]){
		String dbCon = Connection.getConnection();
		System.out.println(dbCon);
		//static method call ClassName.methodName();
	}
}