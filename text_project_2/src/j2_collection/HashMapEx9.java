package j2_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx9 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		/*
		 * 평균점수: 91
		 * 최고점수: 96
		 * 최고점수를 받은 아이디: blue
		 */
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			maxScore = Math.max(maxScore, value);
			totalScore += value;
			
			if (value == maxScore) {
				name = key;
			}
		}
		
		System.out.println("avg: " + (totalScore / map.size()));
		System.out.println("max: " + maxScore);
		System.out.println("max name: " + name);
	}

}
