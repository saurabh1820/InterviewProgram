package collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class IterateTreeMap {

	//Write a program to iterate TreeMap in java? 
	public static void main(String[] args) {
		
		TreeMap<Integer, String> t=new TreeMap<>();
		t.put(1,"A");
		t.put(2,"B");
		t.put(3,"C");
		t.put(4,"D");
		t.put(5,"E");
		t.put(6,"F");
		System.out.println(t);
		
		//First Way
		Set<Entry<Integer, String>> entrySet = t.entrySet();
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
		//SecondWay
//		t.forEach((a,b)->{
//			System.out.println(a+"="+b);
//		});
//		
	}
}
