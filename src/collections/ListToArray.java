package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
//Write a program to convert List to Array.
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
	}
}
