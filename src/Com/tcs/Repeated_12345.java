package Com.tcs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_12345 {
	public static void main(String[] args) {
		 //think before you speak read before you think
		//String[] s = {"think","before","you","speak","read","before","you","think"};
		
		String s ="think before you speak read before you think";
		String[] slit = s.split(" ");
		
		Map<String, Integer> m = new LinkedHashMap<>();
		
		for (String a : slit) {
			if (m.containsKey(a)) {
				Integer i = m.get(a);
				m.put(a, i+1);
				System.out.println(m);
				System.out.println("*************************");
			}
			else {
				m.put(a, 1);
				System.out.println(m);
				System.out.println("*************************");
			}
			
		}System.out.println(m);
		
		 Set<Entry<String, Integer>> entrySet = m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry);
				
			}
			
		}
		}}

		

	


