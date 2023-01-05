package java8;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class DifferentWaysOfIterating {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8);
		
		//First Way
//		asList.forEach(x->{
//			System.out.println(x);
//		});
		
		//Second Way
//		Iterator<Integer> itr = asList.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		//Third Way
//		for(Integer i:asList) {
//			System.out.println(i);
//		}
		
		//Fourth Way
//		ListIterator<Integer> itr = asList.listIterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		while(itr.hasPrevious()) {
//			System.out.println(itr.previous());
//		}
		
		//Fifth Way
		Vector<Integer> v=new Vector<>();
		v.addAll(asList);
		Enumeration<Integer> e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		
	}
}
