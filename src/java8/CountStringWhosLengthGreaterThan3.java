package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringWhosLengthGreaterThan3 {

	//Java 8 program to Count Strings whose length is greater
	//than 3 in List? and print that String
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("ab","abcd","b","c","e","efgh");
	
		long count = asList.stream().filter(c->c.length()>3).count();
		System.out.println("Number Of Strings Greater than 3 : "+count);
		
		List<String> collect = asList.stream().filter(y->y.length()>3).collect(Collectors.toList());
		System.out.println(collect);
	}
}
