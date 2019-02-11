package selenium;

import java.util.HashSet;
import java.util.Iterator;



public class Hashset1 {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();

		s.add("India");
		s.add("USA");
		s.add("India");
		s.add("India");
		System.out.println("Set Size-"+s.size());
		
		// now it will remove duplicates but we dont knw from which index it removed
		//so
	
		
		Iterator<String> Itr= s.iterator();
		s.add("India");
		s.add("USA");
		s.add("India");
		s.add("Russia");
		s.add("India");
		s.add("India");
		s.add("Japan");
		
		while(Itr.hasNext()){
			
	
		System.out.println(Itr.next());
		}
	}
}
	
	

