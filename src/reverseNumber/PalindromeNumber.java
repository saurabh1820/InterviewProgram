package reverseNumber;

public class PalindromeNumber {

	public static void main(String[] args) {
		//First Way
		int num=121;
		int rev=0;
		int same=num;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(same==rev) {
			System.out.println("It Is Palindrome");
		}else {
			System.out.println("It Is Not Palindrome");
		}
		
		//Second Way
		Integer num1=121;
		StringBuffer sb=new StringBuffer(String.valueOf(num1));
		StringBuffer reverse = sb.reverse();
		if(num1.toString().equals(reverse.toString())) {
			System.out.println("It is Palindrome");
		}
		else {
			System.out.println("It is Not Palindrome");
		}
		
		
	}
}
