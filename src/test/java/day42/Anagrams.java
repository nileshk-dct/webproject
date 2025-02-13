package day42;

import java.util.Arrays;

public class Anagrams {
	
	
	public static boolean anagramsstr(String str1, String str2) {
		
		if(str1.length()!=str2.length()) return false;
		
	char[] strchar1	=str1.toCharArray();
		char[] strchar2 =str2.toCharArray();
		
		Arrays.sort(strchar1);
		Arrays.sort(strchar2);
		
		return Arrays.equals(strchar1, strchar2);
	}
	
	public static void main(String[] args) {
		System.out.println(anagramsstr("nilesh", "snileh"));
	}

}
