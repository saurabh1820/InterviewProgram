package reverseNumber;

public class CountTheWords {

	public static void main(String[] args) {
		
		String str="Saurabh Raju Pawade a";
		int count=0;
		String[] s=str.trim().split(" ");
		
		System.out.println(s.length);//we can count like this 
		for(String x:s) {
			System.out.println(x);
			count++;//or like this
		}
		System.out.println(count);
		
		//to find particular charter indexS
		int indexOf = str.indexOf("a");
		System.out.println(indexOf);
	}
	
	
}
