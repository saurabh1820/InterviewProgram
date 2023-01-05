package optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		
		Student s=new Student(1,null,"Saurabh@gmail.com",8208375700L);
		
		Optional<String> nullable = Optional.ofNullable(s.getName());
		if(nullable.isPresent()) {
			System.out.println("It Is Present");
		}
		else
		{
			System.out.println("It Is Not Present");
		}
		
	}
}
