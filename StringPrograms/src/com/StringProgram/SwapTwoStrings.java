package com.StringProgram;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String str1 = "HELLO";
		String str2 = "JAVA!";
		
		System.out.println("Before Swapping: ");
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
			
		System.out.println("========================================================");
		str1 = str1+str2;
		str2 = str1.substring(0,str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("After Swapping: ");
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
	}

}