package com.wipro.test;

public class StringUtil {
	
	public static boolean isUpperCase(String input) 
	{
        if (input == null || input.isEmpty())
        {
        	return false;
        }
        return input.equals(input.toUpperCase());
    }
	public static boolean isLowerCase(String input) 
	{
        if (input == null || input.isEmpty())
        {
        	return false;
        }
        return input.equals(input.toLowerCase());
    }

}