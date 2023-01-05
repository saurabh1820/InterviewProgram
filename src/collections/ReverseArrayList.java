package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	//Write a program to reverse ArrayList in java?
	public static void main(String[] args) {
		
		ArrayList<Integer> array=new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		System.out.println(array);
		Collections.reverse(array);
		System.out.println(array);
	}
}

