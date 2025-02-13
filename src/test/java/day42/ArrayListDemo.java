package day42;

import java.util.ArrayList;
import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ArrayListDemo {
	
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		int sizeal=al.size();
		System.out.println(sizeal);
		
		al.add(8);
		al.add("Welecome");
		al.add(1.90);
		al.add('n');
		al.add(null);
		al.add("");
		System.out.println(al);
		int sizeal1=al.size();
		System.out.println(sizeal1);
		
		al.remove(1);
		
		al.set(1, 2.8);
		
		al.add(1, "welcome");
		
		System.out.println(al.get(1));
		
		System.out.println(al);
		int sizeal2=al.size();
		System.out.println(sizeal2);
		
		System.out.println(al.contains(2.8));
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
			
			
			
		}
		for(Object e: al) {
			System.out.println(e);
		}
		
		Iterator it=al.iterator();
		
		while (it.hasNext()) {
		System.out.println(it.next());
			
		}
			}
	

}
