package reverseNumber;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		
		int[] num= {20,10,50,40,60,30,70};
		int max=num[0];
		int min=num[0];
		
		for(int i=1;i<num.length;i++) {
			
			if(num[i]>max) {
				max=num[i];
			}
		}
		for(int i=1;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println("MAX : "+max);
		System.out.println("MIN : "+min);
	}
	
	
}
