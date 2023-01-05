package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumber {

	//Given a list of integers, find out all the even numbers
	//exist in the list using Stream functions?
	
	public static void main(String[] args) {
		
		
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8);
		List<Integer> evenNumber = asList.stream().filter(x->x%2==0).collect(Collectors.toList());
		List<Integer> oddNumber = asList.stream().filter(y->y%2!=0).collect(Collectors.toList());
		System.out.println("EVEN : "+evenNumber);
		System.out.println("ODD  : "+oddNumber);
	}
}
