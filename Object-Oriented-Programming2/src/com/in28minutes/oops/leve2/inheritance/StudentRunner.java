package com.in28minutes.oops.leve2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Student student = new Student();
		student.setName("ManofGod");
		student.setEmail("in28minutes@gmail.com");*/
		
		/*rson person = new Person();
		person.setName("Ojo");
		person.setEmail("ojo@gmail.com");
		person.setPhoneNumber("09069136878");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);*/
		
		Employee employee = new Employee();
		//employee.setName("Ojo");
		employee.setEmail("ojo@gmail.com");
		employee.setPhoneNumber("09069136878");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");
		System.out.println(employee);
		
	}
	
}
