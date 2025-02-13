package day42;

import java.util.HashMap;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
public class Duplicate{
	
	
	public static void duplicatechar(String str) {
		
		HashMap <Character, Integer> charCount = new HashMap<>();
			
			for(char ch: str.toCharArray()) {
				charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
			}
		for(char ch: charCount.keySet()) {
			if(charCount.get(ch)>1) {
				System.out.println(ch+"  -> "+charCount.get(ch));
			}
		}
	}
	
public static void main(String[] args) {
	duplicatechar("programming");
}
}


