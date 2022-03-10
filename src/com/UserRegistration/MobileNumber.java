package com.UserRegistration;

import java.util.Scanner;

public class MobileNumber {

	public static void main(String[] args) {

		/**
		 * Procedure 
		 * -----------------------------------------------------------
		 * 1.Taking user input of country code and mobile number 
		 * 2.calling method to print true false
		 * 3.created method to Validate country code and mobile number
		 * -----------------------------------------------------------
		 */

		// 1.Taking user input of country code and mobile number
		Scanner sc = new Scanner(System.in);

		System.out.println("Example 91 9846521868 ");
		System.out.print("Enter country code and mobile number ");
		String mblno = sc.nextLine();
		/*
		 * 2.calling method to print true false
		 */
		System.out.println(number(mblno));
		;

	}

	// 3.created method to validate country code and mobile number
	public static boolean number(String mblno) {
		return mblno.matches("[0-9]{2}\s[0-9]{10}");
	}
}
