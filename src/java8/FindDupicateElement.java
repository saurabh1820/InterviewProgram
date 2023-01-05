package java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDupicateElement {

	//How to find duplicate elements in a given integers
	//list in java using Stream functions?
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,2,5,4,6,5,6,7);
		Set<Integer> set=new HashSet<>();
		List<Integer> dupicateElement = asList.stream().filter(x->!set.add(x)).collect(Collectors.toList());
		System.out.println(dupicateElement);
	}
	
}
