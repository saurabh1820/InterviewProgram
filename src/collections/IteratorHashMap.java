package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorHashMap {

	//Write a program to iterate the HashMap ?
	public static void main(String[] args) {
		
		HashMap<Integer,String> has=new HashMap<>();
		has.put(1, "A");
		has.put(2, "B");
		has.put(3, "C");
		has.put(4, "D");
		has.put(5, "E");
		System.out.println(has);
		
		//First Way
//		Set<Entry<Integer, String>> set = has.entrySet();
//		Iterator<Entry<Integer, String>> itr = set.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		//Second Way
//		has.forEach((a,b)->{
//			System.out.println(a+"="+b);
//		});
//		
		//Third way
//		Set<Integer> key = has.keySet();
//		Collection<String> values = has.values();
//		Iterator<String> itr2 = values.iterator();
//		Iterator<Integer> itr = key.iterator();
//		while(itr.hasNext()&& itr2.hasNext()) {
//			System.out.println(itr.next()+"="+itr2.next());//key
//			
//		}
	}
}
