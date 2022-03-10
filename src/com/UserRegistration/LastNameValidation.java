package com.UserRegistration;

import java.util.Scanner;

public class LastNameValidation {

	public static void main(String[] args) {
		
		/*
		 * 1.Taking user input of first name and last name
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Name: ");
		String fname = sc.nextLine();
		System.out.println(name(fname));
		System.out.print("\nEnter the Last Name: ");
		String lname = sc.nextLine();
		System.out.println(name(lname));
	}

	/*
	 * 2.created method to check 1st letter is capital and has minimum 3 letters
	 */
	public static boolean name(String nameValidation) {
		return nameValidation.matches("[A-Z]{1}[a-z]{3,}");
	}
}
