package Hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.putIfAbsent(4, "Guava");
		map.put(5, "Mango");
		
		map.entrySet().forEach(action -> {
			map.put(6, "Berry");
			System.out.println(action);

		});

	}

}
