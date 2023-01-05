package reverseNumber;

public class ReverseString3 {

	//by using StringBuffer
	public static void main(String[] args) {
	
		String str="ABCD";
		StringBuffer sb=new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);
	}

}
