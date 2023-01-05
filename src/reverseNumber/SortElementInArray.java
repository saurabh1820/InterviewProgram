package reverseNumber;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortElementInArray {

	public static void main(String[] args) {
		
		Integer[] num= {2,1,4,3,5,6,9,7,8};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j]) {
					
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					
					/*Without Third Variable
					num[i]=num[i]+num[j];
					num[j]=num[i]-num[j];
					num[i]=num[i]-num[j];*/
					
					/*Without third variable
					num[i]=num[i]*num[j];
					num[j]=num[i]/num[j];
					num[i]=num[i]/num[j];*/	
				}
			}	
		}
		//Forth Way
		//Arrays.sort(num);
		//Arrays.sort(num,Collections.reverseOrder());
		System.out.println(Arrays.toString(num));
	}
}
