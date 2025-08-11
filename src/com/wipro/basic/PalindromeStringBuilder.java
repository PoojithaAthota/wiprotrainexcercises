package com.wipro.basic;

public class PalindromeStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Madam";
//        String reversed = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//        
//        if (str.equalsIgnoreCase(reversed)) {
//            System.out.println(str + " is a palindrome.");
//        } 
//        
//        else {
//            System.out.println(str + " is not a palindrome.");
//        }
        
        StringBuilder sb = new StringBuilder(str);
        String reversed = sb.reverse().toString();

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
}

}
