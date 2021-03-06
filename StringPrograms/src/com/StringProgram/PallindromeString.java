package com.StringProgram;

import java.util.Scanner;

public class PallindromeString {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		boolean isPallindrome = true;
		
		int startIdx = 0;
		int lastIdx = s.length()-1;
		
		while(startIdx < lastIdx) {
			if(s.charAt(startIdx) != s.charAt(lastIdx)) {
				isPallindrome = false;
				System.out.println("String "+s+" is not a pallindrome");
				break;
			}
			startIdx++;
			lastIdx--;
		}
		
		if(isPallindrome) {
			System.out.println("String "+s+" is pallindrome");
		}
	}

}
