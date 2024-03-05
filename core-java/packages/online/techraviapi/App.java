//https://techraviapi.online/

package online.techraviapi;

import online.techraviapi.db.*;
public class App{
	
	public static void main(String args[]){
		System.out.println("This is package demo.");
		
		DBConnection db = new DBConnection();
		System.out.println(db.getConnection());
	}
	
}

/*
javac ./online/techraviapi/App.java


$ java online.techraviapi.App

Output:
This is package demo.


*/