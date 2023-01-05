package reverseNumber;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		
		//how many times [a] is repeated
		String str="saurabh raju pawade";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}
