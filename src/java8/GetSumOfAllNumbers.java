package java8;

import java.util.Arrays;
import java.util.List;

public class GetSumOfAllNumbers {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
		int sum = asList.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}
