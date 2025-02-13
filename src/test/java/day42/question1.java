package day42;

public class question1 {
	
	
	public static boolean isPalindrome(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		String reversed = sb.reverse().toString();
	
	return str.equals(reversed);
	}
	
	public static void main(String[] args) {
		
	System.out.println(isPalindrome("priya"));
	}

}
