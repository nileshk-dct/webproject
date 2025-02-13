package day42;


	
	public class Fibonacci {
	    public static int fibonacci(int n) {
	        if (n <= 1) return n;
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    public static void main(String[] args) {
	        System.out.println("Fibonacci(6): " + fibonacci(6));
	    }
	}

	/*
	 * public static int fibonacci(int n) { if(n<=1) return n; return fibonacci(n-1)
	 * + fibonacci(n - 2); }
	 * 
	 * public static void main(String[] args) { System.out.println(fibonacci(6)); }
	 */

