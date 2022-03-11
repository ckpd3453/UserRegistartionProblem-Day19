package com.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatches {
	String[] email = {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@abc.com",
						"abc-100@abc.net","abc.100@abc.com.au","abc@1.com","abc@gmail.com.com",
						"abc+100@gmail.com","abc","abc@.com.my","abc123@gmail.a","abc123@.com",
						"abc123@.com.com","..abc@abc.com",".abc()*@gmail.com","abc@%*.com",
						"abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com",
						"abc@gmail.com.1a","abc@gmail.com.aa.au"};

	void check()
	{
		System.out.println("*********valid Emails*********");
		for(int i=0;i < email.length;i++)
		{
		
			String regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email[i]); 
			
				if(matcher.matches())
				{
					System.out.println(i+")"+" Email: "+email[i]);
					System.out.println("  Valid Email");
				}
			
			}
		
		System.out.println("\n\n*********Invalid Emails*********");
		for(int i=0;i < email.length;i++)
		{
		
			String regex = "^[a-zA-Z0-9]+([._+-][0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(email[i]); 
			
				if(matcher.matches())
				{
					
				} 
				else 
				{
					System.out.println(i+")"+" Email: "+email[i]);
					System.out.println("  Not Valid Email");
				}
			
			}
	}

}
