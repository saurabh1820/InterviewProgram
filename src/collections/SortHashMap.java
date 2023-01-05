package collections;

import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortHashMap {

	//Write a program to sort HashMap by keys 
	public static void main(String[] args) {
		
		HashMap<Integer, String> has=new HashMap<>();
		has.put(1,"A");
		has.put(5,"E");
		has.put(300,"D");
		has.put(6,"C");
		has.put(1222,"B");
		has.put(8,"F");
		has.put(7,"G");
		System.out.println(has);
		TreeMap<Integer, String> tree=new TreeMap<>();
		tree.putAll(has);
		System.out.println(tree);
	
	}
}
