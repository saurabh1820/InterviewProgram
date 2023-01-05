package practise;

public class Practise {

	public static void main(String[] args) {
		
		int num=121;
		int rev=0;
		int a=num;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		if(a==rev)
		{
			System.out.println("It Is Palindrome");
		}
		else
		{
			System.out.println("It Is Not Palindrome");
		}
	}
}
