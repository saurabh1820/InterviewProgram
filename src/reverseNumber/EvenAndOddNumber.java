package reverseNumber;

public class EvenAndOddNumber {

	public static void main(String[] args) {
		
		int[] num= {1,2,3,4,5,6,7};
		System.out.println("EVEN NUMBER : ");
		for(int i=0;i<=num.length-1;i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("ODD NUMBER");
		for(int i=0;i<=num.length-1;i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]);
			}
		}
		
		System.out.println("ForEACH: EVEN");
		for(int even:num) {
			if(even%2==0) {
				System.out.println(even);
			}
		}
		System.out.println("ForEach : ODD");
		for(int odd:num) {
			if(odd%2!=0) {
				System.out.println(odd);
			}
		}
	}
}
