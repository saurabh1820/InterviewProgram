package reverseNumber;

public class SumOfDigit {

	public static void main(String[] args) {
		
	
		//SumOfDigit By While Loop
		int num1=123456;
		int sum1=0;
		
		while(num1>0) {
			sum1=sum1+num1%10;
			num1=num1/10;
		}
		System.out.println(sum1);
		
	}
}
