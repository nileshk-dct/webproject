package day42;

import java.util.HashMap;

public class DuplicateCharInString {
	
	public static void duplicatechar(String str) {
		HashMap<Character, Integer> charcount = new HashMap<>();
		
		for(char ch: str.toCharArray()) {
			charcount.put(ch, charcount.getOrDefault(ch, 0)+1);
		}
		
		for(char ch: charcount.keySet()) {
			if(charcount.get(ch)>1)
				System.out.println("Duplicate Character"+" -> "+ ch+" "+ charcount.get(ch));
		}
	}
		
		public static void main(String[] args) {
			duplicatechar("programming");
		}
	

}
