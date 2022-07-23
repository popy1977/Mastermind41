package com.practicecode;

public class JavaPractice {

	public static void main(String[] args) {
		
		String s="popy123@";//popy123@ is a string not char or int
		String ss="shuvo";
		//s.equals(); or contains or containsEquals() or comparing within 2 strings
		System.out.println(s.equals(ss));// result is false because 2 values are not same
		
		System.out.println(s.toUpperCase()); // converts the value all upper case
		System.out.println(s.toLowerCase()); // convert the value all lower case
		System.out.println(s.length()); //counts how many letters/char in the strings
		
		
		StringBuilder sb=new StringBuilder(s);
		
		//sb.reverse().toString();	
		System.out.println(sb.reverse().toString());
	}

}
