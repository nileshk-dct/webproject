package day42;

import java.util.Arrays;

public class MinandMax {
	
	public static void main(String[] args) {
		int[] numbers= {90,86,12,9,3};
		
		Arrays.sort(numbers);
	System.out.println(numbers[0]);
	System.out.println(numbers[numbers.length-1]);
	}

}
