package collections;

import java.util.HashSet;

public class IterateHashSet {

	//Write a program to traverse(or iterate) HashSet?
	public static void main(String[] args) {
		
		HashSet<Integer> h=new HashSet<>();
		for(int i=0;i<10;i++)
		{
			h.add(i);
		}
		
		System.out.println(h);
		h.forEach(x->{
			System.out.println(x);
		});
		
	
	}
}
