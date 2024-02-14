public class TypeCasting1{
	
	public static void main(String args[]){
		byte a = 126;
		byte b = 5;
		int res =  a + b; // 131 -- 
		byte r =  (byte)res;
		System.out.println("Result of a and b = " + r);
	}

}

/**
Type casting

short r =  (short) a + b;// 30 - (-128 to 127) -- byte to int automatically
byte r = (byte) a + b ;

D:\java\core-java\variables>javac TypeCasting1.java
TypeCasting1.java:6: error: incompatible types: possible lossy conversion from int to byte
                byte r = a + b;// 30 - (-128 to 127)
                           ^
1 error
*/