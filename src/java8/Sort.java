package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

	//Given a list of integers, sort all the values present
	//in it using Stream functions?
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,3,2,5,4,9,6,8,7);
		List<Integer> sortAsc = asList.stream().sorted().collect(Collectors.toList());
		List<Integer> sortDesc = asList.stream().sorted((a,b)->-a.compareTo(b)).collect(Collectors.toList());
		System.out.println(sortAsc);
		System.out.println(sortDesc);
	}
}
