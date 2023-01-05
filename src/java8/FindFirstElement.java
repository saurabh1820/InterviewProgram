package java8;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {

	//Given the list of integers, find the first element
	//of the list using Stream functions?
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(10,2,3,4,5,6);
		Integer integer = asList.stream().findFirst().get();
		System.out.println(integer);
	}
}
