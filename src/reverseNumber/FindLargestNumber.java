package reverseNumber;

public class FindLargestNumber {

	public static void main(String[] args) {
		
		int a=40;
		int b=100;
		int c=30;
		
		if(a>b && a>c) {
			System.out.println("A is Largest");
		}
		else if(b>a && b>c) {
			System.out.println("B is Largest");
		}
		else if(c>a && c>b) {
			System.out.println("C is Largest");
		}
	}
}
