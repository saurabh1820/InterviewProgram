package reverseNumber;

public class PalindromeString {

	public static void main(String[] args) {
		
		String str="BAB";
		StringBuffer sb=new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		if(str.equals(reverse.toString()))
		{
			System.out.println("It Is Palindrome");
		}
		else {
			System.out.println("It Is Not  Palindrome");
		}
	}
}
