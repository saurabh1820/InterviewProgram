package reverseNumber;

public class ReverseNumber2 {

	//By Using StringBuffer reverse method
	public static void main(String[] args) {
		
		int num=12345;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
	}

}
