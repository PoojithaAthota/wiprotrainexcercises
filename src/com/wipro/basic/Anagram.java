package com.wipro.basic;

public class Anagram {
	    public static void main(String[] args) {
	        String input = "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase";
	        
	        String[] words = input.split(" ");
	        String shortest = words[0];

	        for (String word : words) {
	            if (word.length() < shortest.length() || (word.length()>2)) {
	                shortest = word;
	            }
	        }

	        System.out.println("The shortest word is: " + shortest);
	    }
	}


