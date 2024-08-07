package Q0408;

import java.util.*;

public class TreeSetTest2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("ȫ�浿", 85);
		map.put("���屺", 90);
		map.put("��  ��", 79);
		map.put("ȫ�浿", 91);
		
		System.out.println("�� entry �� : " +map.size());
		
		System.out.println("\tȫ�浿 : "+map.get("ȫ�浿"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		map.remove("ȫ�浿");
		System.out.println("�� entry �� : "+ map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while ( entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			//map�� set���� �ٲ㼭 ��ȯ���Ѽ� ��ü ���°�
			System.out.println("\t"+key + " : "+value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("�� entry �� : "+ map.size());
	}
	

}
