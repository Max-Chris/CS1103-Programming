package com.in28minutes.exceptionhandling;

public class ExceptionHandlingRunner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();

	}

	private static void method1() {
		method2();
	}
	private static void method2() {
	try {
		
			//String str = null;
			//str.length();
		int [] i = new int [] {1,2,3,4};
		int number = i[4];
		}	
	catch (NullPointerException e) {
		System.out.println("Matched Exception");
		e.printStackTrace();
	}
	catch (IndexOutOfBoundsException ex) {
		System.out.println("This is a null pointer exception");
		ex.printStackTrace();
	}
	 
	}

}
