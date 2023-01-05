package reverseNumber;

import java.util.Random;
import java.util.UUID;

public class GenerateRamdom {

	public static void main(String[] args) {
		//random number First Way
		String string = UUID.randomUUID().toString();
		System.out.println(string);
		
		//random number Second way
		Random random=new Random();
		int nextInt = random.nextInt(10000);
		System.out.println(nextInt);
		
		
		
	}
}
