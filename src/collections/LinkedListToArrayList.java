package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListToArrayList {

	//Write a program to convert LinkedList to ArrayList?
	
	public static void main(String[] args) {
		
		LinkedList<Integer> linked=new LinkedList<>();
		for(int i=0;i<10;i++) {
			linked.add(i);
			
		}
		System.out.println("Linked"+linked);
		
		//ArrayList<Integer> arraylist=new ArrayList<>();
		//arraylist.addAll(linked);
		//Or
		ArrayList<Integer> arraylist=new ArrayList<>(linked);
		System.out.println("ArrayList"+arraylist);
		
		
	}
}
