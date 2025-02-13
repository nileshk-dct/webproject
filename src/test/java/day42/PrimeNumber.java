package day42;

public class PrimeNumber {

	
	public static boolean isprimenumber(int  num) {
		
		if(num<=1) return false;
		for(int i=2; i <=Math.sqrt(num); i++) {
			if(num%i==0) return false;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
System.out.println(isprimenumber(17));
	}
}
