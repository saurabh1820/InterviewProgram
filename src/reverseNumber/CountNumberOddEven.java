package reverseNumber;

public class CountNumberOddEven {

	//Count Number Even Odd
	public static void main(String[] args) {
		
		int num =1234567;
		int count1=0;
		int count2=0;
		while(num>0) {
			if(num%2==0) {
				num=num/10;
				count1++;
			}else {
				num=num/10;
				count2++;
			}
		}
		System.out.println("EVEN : "+count1);
		System.out.println("ODD : "+count2);
	}
}
