package customizeJava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"Saurabh",Arrays.asList("Saurabh@gmail.com"),900000L);
		Employee e2=new Employee(2,"Aashutosh",Arrays.asList("Aashutosh@gmail.com"),800000L);
		Employee e3=new Employee(3,"Mayur",Arrays.asList("Mayur@gmail.com"),350000L);
		Employee e4=new Employee(4,"Krunal",Arrays.asList("Krunal@gmail.com"),350000L);
		
		ArrayList<Employee> a=new ArrayList<>();
		a.add(e1);
		a.add(e2);
		a.add(e3);
		a.add(e4);
		System.out.println(a);
		
		//we will get linear result
//		a.stream().forEach(x->{
//			System.out.println(x);
//		});
		
		//we will get random result
//		a.parallelStream().forEach(y->{
//			System.out.println(y);
//		});
		
		//fetch  FIRST WAY the highest salary employee
	//	Employee employee = a.stream().max((c,d)->c.getSalary().compareTo(d.getSalary())).get();
	//	System.out.println(employee);
		
		//fetch  SECOND WAY the highest salary employee
	//	Comparator<Employee> t=(x,y)->-x.salary.compareTo(y.salary);
	//	List<Employee> collect2 = a.stream().sorted(t).limit(2).collect(Collectors.toList());
	//	System.out.println(collect2);
		
	//Map :-> it will return list of list if we use list of things or one to many relation
		
		//List<List<String>> collect = a.stream().map(Employee::getEmail).collect(Collectors.toList());
		//List<List<String>> collect = a.stream().map(x->x.getEmail()).collect(Collectors.toList());
		
	//FlatMap :->it will return only list if we performing on list object or we can say one to many
	//	List<String> collect = a.stream().flatMap(x->x.getEmail().stream()).collect(Collectors.toList());
		
	//	System.out.println(collect);
		

		
	}
}
