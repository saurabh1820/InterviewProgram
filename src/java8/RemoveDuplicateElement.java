package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,1,3,4,5,6,8);
		List<Integer> collect = asList.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}
