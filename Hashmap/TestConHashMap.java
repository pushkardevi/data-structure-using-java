package Hashmap;

import java.util.HashMap;

class HashMapDemo extends Thread {
	static HashMap<Integer, String> l = new HashMap<Integer, String>();

	public void run() {

		try {
			Thread.sleep(1000);
			// Child thread trying to add
			// new element in the object
			l.put(103, "D");
		} catch (InterruptedException e) {
			System.out.println("Child Thread going to add element");
		}
	}

}
