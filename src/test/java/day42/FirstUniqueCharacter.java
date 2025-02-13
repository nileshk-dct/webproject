package day42;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {
	
	
	public static char uniquechar(String str) {
		
		Map<Character, Integer> mapcount = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			
			mapcount.put(ch, mapcount.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : mapcount.entrySet()) {
			if(entry.getValue()==1) return entry.getKey();
			
			
		}
		return '_';
	}
	
	public static void main(String[] args) {
		//System.out.println(uniquechar("pprogrramming"));
	System.out.println("Unique Characcter is: " +" "+uniquechar("progrm"));
	}
	
	

}
