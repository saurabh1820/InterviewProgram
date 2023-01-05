package optional;

import java.util.Optional;

public class OptionalDemoInSameClass {

	int x=10;
	public static void main(String[] args) {
		OptionalDemoInSameClass o=null;
		Optional<OptionalDemoInSameClass> nullable = Optional.ofNullable(o);
		if(nullable.isPresent())
		{
			System.out.println(o.x);
		}
		else
		{
			System.out.println("Value Is Not Present");
		}
	
	}
}
