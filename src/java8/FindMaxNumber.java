package java8;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumber {

	//Given a list of integers, find the maximum value element 
	//present in it using Stream functions?
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,500,6,7,89);
		Integer maxNumber = asList.stream().max((a,b)->a.compareTo(b)).get();
		
		Integer MinNumber = asList.stream().min((c,d)->c.compareTo(d)).get();
		
		System.out.println(maxNumber);
		System.out.println(MinNumber);
		
		
	}
}
