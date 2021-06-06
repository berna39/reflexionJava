package Models;

import java.util.List;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exemplesString();
	}
	
	private static void exemplesString() {
		String string = new String("Terminator");
		
		// to get the class
		System.out.println(string.getClass());
		
		// to get the super class on the class String
		System.out.println(String.class.getSuperclass());
		
		// to get String class's interfaces
		System.out.println("==== Interfaces ====");
		Class[] faces = String.class.getInterfaces();
		for(int i =0; i < faces.length; i++)
			System.out.println(faces[i]);
		
		// to get String class's methods
		Method[] methods = String.class.getMethods();
		System.out.println("==== Methods ("+methods.length+") ====");
		for(int i =0; i < methods.length; i++)
			System.out.println(methods[i]);
		
		// to get String class's fields
		Field[] fields = String.class.getFields();
		System.out.println("==== Fields ("+fields.length+") ====");
		for(int i =0; i < fields.length; i++)
			System.out.println(fields[i]);
		
		// to get String class's constructors
		Constructor[] construictors = String.class.getConstructors();
		System.out.println("==== construictors ("+construictors.length+") ====");
		for(int i =0; i < construictors.length; i++)
			System.out.println(construictors[i]);
	
	}

}
