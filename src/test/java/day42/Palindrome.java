package day42;

public class Palindrome {

	
	public static boolean palindrome (String str) {
		
		String reversed = new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
		
	}
	
public static void main(String[] args) {
	System.out.println(palindrome("nilesh"));
}}
