package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multiply3ToAllElements {

	// Java 8 program to multiply 3 to all element in list and print the list?
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> collect = asList.stream().map(x->x*3).collect(Collectors.toList());
		System.out.println(collect);
	}
}
