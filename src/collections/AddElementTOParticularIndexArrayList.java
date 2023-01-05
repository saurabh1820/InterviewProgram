package collections;

import java.util.ArrayList;

public class AddElementTOParticularIndexArrayList {

	//Write a program to add element at particular index of ArrayList?
	//Write a program to remove element from specified index of ArrayList
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<>();
		a.add(103);
		a.add(0, 101);//to add particular index
		a.add(1, 102);
		System.out.println(a);
		a.remove(0);//to remove element of particular index
		System.out.println(a);
	}
}
