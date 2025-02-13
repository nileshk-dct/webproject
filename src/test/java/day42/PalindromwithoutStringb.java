package day42;

public class PalindromwithoutStringb {
	
	public static boolean ispalindrome(String str) {
//String str = "madam";
	
	int left=0;

int right=str.length()-1;

	while(left<right) {
		
		if(str.charAt(left)!=str.charAt(right)) {
			return false;
		}
		left++;
		right--;
	}
	return true;
}
	public static void main(String[] args) {
		
	System.out.println(ispalindrome("nilesh"));	
	}
}
