package reverseNumber;

import java.util.Arrays;

public class SearchElemnetInArray {

	public static void main(String[] args) {
		//Linear Search
		int[] num= {4,5,6,7,8,3,2};
		int search=4;
		
		for(int i=0;i<num.length;i++) {
			
			if(search==num[i]) {
				
				System.out.println("Search Element at postion : "+i);
			}
		}
		
		//Binary Search
		int[] num1= {1,3,2,4,5,7,6,9,8};
		Arrays.sort(num1);
		int binarySearch = Arrays.binarySearch(num1, 4);
		System.out.println("Search Element at postion : "+binarySearch);
	}
	
}
