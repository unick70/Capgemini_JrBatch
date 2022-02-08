package com.capgiday2;

import com.capgiday2.student.Address;

class student {

	//nested class
	static class Address {
		int houseNo;
		String streetName;

		public void print() {
			System.out.println("Nested class");

		}
	}

	static {
		java.lang.System.out.println("i am static");

	}
	private int rollno1;
	private String name;

	public String tostring() {
		return "Student[rollno= + rollno +, name= + name +schoolname+schoolName+]";

	}

	public student(int rollno, String name) {
		super();
		this.rollno1 = rollno;
		this.name = name;
	}

	private int rollno;
	// string is not a data
	// String is data type
	private String name1;
	static String SchoolName;

	public static void staticmethod() {
		System.out.println("School Name" + SchoolName);
	}
}

public class MyStatic {
	private static final String Student = null;
	private static char[] s1;
	private static char[] s2;
	private static char[] s3;

	public static void main(String args[]) {
		student.SchoolName = "abc school";

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		student.staticmethod();

		student.Address address = new Address();
		address.print();

	}

}
