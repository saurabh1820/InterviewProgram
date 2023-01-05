package collections;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {

	//Write a program to convert HashSet to Array?
	public static void main(String[] args) {
		
		HashSet<Integer> has=new HashSet<>();
		has.add(1);
		has.add(2);
		has.add(3);
		has.add(4);
		has.add(5);
		has.add(6);
		System.out.println(has);
		Object[] array = has.toArray();
		System.out.println(Arrays.toString(array));
		
	}
}
