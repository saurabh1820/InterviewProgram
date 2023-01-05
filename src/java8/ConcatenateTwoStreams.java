package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateTwoStreams {

	//Java 8 program to perform concatenation on two Streams
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Integer> list2 = Arrays.asList(5,6,7,8);
		Stream<Integer> concat = Stream.concat(list1.stream(), list2.stream());
		concat.forEach(x->{
			System.out.print(x);
		});
	}
}
