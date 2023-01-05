package reverseNumber;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		
	int[] a= {1,2,3,4,5,6};
	int[] b= {1,2,3,4,5,6};
	
	//FIRST WAY
	boolean equals = Arrays.equals(a,b);
	if(equals==true) {
		
		System.out.println("Both Arrays Are Equals");
	}else {
		System.out.println("Both Arrays Are Not Equals");
	}

	
	//SECOND WAY
	int lengthA = a.length;
	int lengthB = b.length;
	if(lengthA==lengthB) {
		System.out.println("Both Arrays Are Equals");
	}else {
		System.out.println("Both Arrays Are Not Equals");
	}
	
	
	}
	
	
}
