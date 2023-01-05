package collections;

import java.util.Arrays;
import java.util.List;

public class ProgramToCheckIfElementExists {

	//Given an element write a program to check if element(value) exists in ArrayList?
	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6);
		if(asList.contains(1)) {
			System.out.println("It Is Present");
		}else {
			System.out.println("It Is Not Present");
		}
	}
}
