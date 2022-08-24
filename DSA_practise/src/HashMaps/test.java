package HashMaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		HashMap<String, Integer> empIds = new HashMap<>();
		empIds.put("jerry",123);
		empIds.put("tom",9897);
		empIds.put("daniel",876);
		//no order try to print multiple times
		System.out.println(empIds.get("tom"));
		System.out.println(empIds.containsKey("daniel"));
		System.out.println(empIds.containsValue(876));
		empIds.put("tom", 143);
		System.out.println(empIds.get("tom"));
		empIds.put("vishal", 123);
		empIds.putIfAbsent("Vishal", 144);
		empIds.putIfAbsent("vishal", 244);
		empIds.replace("vishal", 123,4576); //means if value 123 hoy to j replace
		empIds.remove("tom");
		System.out.println(empIds);
		
		Set<Entry<String, Integer>> entrSet = empIds.entrySet();//anhiya entrySet ni jagya e only empIds.values() and empIds.keySet pan thay
		for(Entry<String, Integer> entry : entrSet) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		//empIds.clear();
		System.out.println("map size : "+empIds.size());
		
		//get it synchronized 
		Map<String, Integer> syncMap =  Collections.synchronizedMap(empIds);
		System.out.println(syncMap);

	}
}
