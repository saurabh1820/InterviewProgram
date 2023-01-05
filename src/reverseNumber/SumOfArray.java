package reverseNumber;

public class SumOfArray {

	public static void main(String[] args) {
		
		int[] a= {1,2,3,4,5,6,7};
		int sum=0;
		//FIRST WAY
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		
		//SECOND WAY
		for(int value:a) {
			sum=sum+value;
		}
		System.out.println(sum);
	}
}
