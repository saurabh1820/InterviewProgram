package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizeHashMap extends Thread{
	
	//If We Use HashMap THen We will Get ConcurrentModificationException
	static ConcurrentHashMap<Integer, String> has=new ConcurrentHashMap<>();
	
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		has.put(103,"C");
	}
	public static void main(String[] args)throws InterruptedException {
		
		has.put(101, "A");
		has.put(102, "B");
		SynchronizeHashMap t=new SynchronizeHashMap();
		t.start();
		Set<Entry<Integer, String>> entrySet = has.entrySet();
		Iterator<Entry<Integer, String>> itr = entrySet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			Thread.sleep(3000);
		}
		
		
	}

		
}
