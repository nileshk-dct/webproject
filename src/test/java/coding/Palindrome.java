package coding;


	
	public class Palindrome {  // Define Class 
		
		
	    public static boolean isPalindrome(String str) {
	    	
	    	
	        return str.equals(new StringBuilder(str).reverse().toString());
	        
	        
	    }
	    
	    
	    public static void main(String[] args) {
	    	
	        System.out.println(isPalindrome("racecar")); // true
	        
	    }
	}


