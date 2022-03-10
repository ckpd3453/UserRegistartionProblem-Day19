package com.UserRegistration;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		/**
		 * Procedure 
		 * -----------------------------------------------------------
		 * 1.Taking user input password 
		 * 2.calling method to print true false 
		 * 3.created method to Validate password
		 * -----------------------------------------------------------
		 */

		// 1.Taking user input of country code and mobile number
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Password: ");
		String pwd = sc.nextLine();
		/*
		 * 2.calling method to print true false
		 */
		System.out.println(password(pwd));
		;

	}

	// 3.created method to validate password
	public static boolean password(String pwd) {
		return pwd.matches("^[a-z A-Z]{8,}$");
	}
}
