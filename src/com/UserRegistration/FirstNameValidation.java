package com.UserRegistration;

public class FirstNameValidation {

	public static void main(String[] args) {

		System.out.println(firstName("Chandra"));
	}

	// validate first name
	public static boolean firstName(String firstName) {
		return firstName.matches("[A-Z][a-z]*");
	}

}
