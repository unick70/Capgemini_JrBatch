package com.StringProgram;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		
		System.out.println("String before removing character : "+s);
		
		System.out.println("Enter the character which you want to remove : ");
		String ch = sc.next();
		
		s = s.replace(ch, "");
		System.out.println("String after removing character : "+s);
	}

}
