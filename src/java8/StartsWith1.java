package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWith1 {

	//Given a list of integers, find out all the numbers
	//starting with 1 using Stream functions?
	
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,23,54,13,16,121,75,19);
		List<String> collect = asList.stream().map(s->s+"").filter(x->x.startsWith("1")).collect(Collectors.toList());
		System.out.println(collect);
	}
}
