package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortArrayList {

	//Write a program to sort ArrayList using Comparable and Comparator
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		list.add(25);
		list.add(21);
		list.add(15);
		list.add(24);
		list.add(35);
		list.add(55);
		System.out.println(list);
		
		//comparable default sorting
		Collections.sort(list);
		System.out.println(list);
		
		
	//	Comparator<Integer> c=(x,y)->x.compareTo(y);
		
		//Comparator
		Collections.sort(list, (a,b)->-a.compareTo(b));
		System.out.println(list);

	} 
	
}
