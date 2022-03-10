package com.UserRegistration;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		
		/*
		 * 1.Taking user input of first name and last name
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("(hint: abc45@bl.co.in)");
		System.out.print("Enter the Email Id: ");
		String email = sc.nextLine();
		System.out.println(id(email));
		
	}

	/*
	 * 2.created method to check 1st letter is capital and has minimum 3 letters
	 */
	public static boolean id(String nameValidation) {
		return nameValidation.matches("([a-z]+[0-9]+@bl[.]co[.]in)*");
	}
}
