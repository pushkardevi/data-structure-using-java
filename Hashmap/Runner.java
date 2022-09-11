package Hashmap;

import java.util.HashMap;

public class Runner {

	public static void main(String[] args) throws InterruptedException {

		HashMapDemo.l.put(100, "A");
		HashMapDemo.l.put(101, "B");
		HashMapDemo.l.put(102, "C");
		HashMapDemo t = new HashMapDemo();
		t.start();

		for (Object o : HashMapDemo.l.entrySet()) {
			Object s = o;
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(HashMapDemo.l);
	}
}
