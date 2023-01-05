package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	//Write a program to convert Array to List?
	public static void main(String[] args) {
		
		Integer[] array= {1,2,3,4,5,6,7,8};
	
		//First Way
		List<Integer> asList = Arrays.asList(array);
		System.out.println(asList);
		
		//Second Way
		List<Integer> list=new ArrayList<>(Arrays.asList(array));
		System.out.println(list);
		
	}
}
