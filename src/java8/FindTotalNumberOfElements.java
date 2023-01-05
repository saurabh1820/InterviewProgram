package java8;

import java.util.Arrays;
import java.util.List;

public class FindTotalNumberOfElements {

	//Given a list of integers, find the total number of 
	//elements present in the list using Stream functions?
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		long count = asList.stream().count();
		System.out.println(count);
	}
}

