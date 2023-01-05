package collections;

import java.util.ArrayList;

public class FindLengthOfArrayList {

	
	//Write a program to find the length of the ArrayList
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<>();
		a.add(101);
		a.add(102);
		a.add(103);
		a.add(104);
		a.add(105);
		
		int size = a.size();
		System.out.println(size);
	}
}
