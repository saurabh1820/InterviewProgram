package collections;

import java.util.HashMap;

public class CheckHashMapIsEmplty {

	public static void main(String[] args) {
		
		HashMap<String, String> has= new HashMap<>();
		has.put("ABC","DEF");
		if(has.isEmpty()) {
			System.out.println("It IS Empty");
		}
		else
		{
			System.out.println("It Is Not Empty");
		}
	}
}
