package reverseNumber;

//to check prime number there are two condition 
//first is it should greater than 1
//second is it should be divided by itself
public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=6;
		int count=0;
		if(num>1)
		{
			for(int i=1;i<=num;i++) {
				if(num%i==0)
				{
					count++;
				}
			}
			if(count==2) {
				System.out.println("This Is Prime Number");
			}else {
				System.out.println("This Is Not Prime Number");
			}
			
		}else {
			System.out.println("It is Not Prime Number");
		}
	}
}
