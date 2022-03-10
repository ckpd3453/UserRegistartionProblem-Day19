package com.UserRegistration;

import java.util.Scanner;

public class UpperCase {

	public static void main(String[] args) {

		/**
		 * Procedure 
		 * -----------------------------------------------------------
		 * 1.Taking user input 
		 * 2.calling method to print true false 
		 * 3.created method to Validate atleast 1 upper case
		 * -----------------------------------------------------------
		 */

		// 1.Taking user input 
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Password: ");
		String pwd = sc.nextLine();
		/*
		 * 2.calling method to print true false
		 */
		System.out.println(password(pwd));
		;

	}

	// 3.created method to validate atleast 1 upper case
	public static boolean password(String pwd) {
		return pwd.matches("^(?=.*[A-Z]).{8,}$");
	}
}
