package com.in28minutes.passbyvalue.level1;

public class PassByValue {
	public static void go(int [] array) {
		System.out.println(array[1]);
		array[1] = 22;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[] = new int[] {1,2};
		go(array1);
		System.out.println("value at point 4" + " " +array1[1]);


	}
	

}
