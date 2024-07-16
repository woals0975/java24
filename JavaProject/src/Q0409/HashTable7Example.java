package Q0409;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class HashTable7Example {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 10);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);

		System.out.println("[c-f ������ �ܾ� �˻�]");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		for (Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + "������ \n");

		}
		System.out.println();
	}

}
