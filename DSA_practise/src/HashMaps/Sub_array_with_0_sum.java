package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Input:  { 4, 2, -3, -1, 0, 4 }
//
//Subarrays with zero-sum are
// 
//{ -3, -1, 0, 4 }
//{ 0 }
public class Sub_array_with_0_sum {
	public static void main(String[] args) {
		int[] nums = { 3, 4, -7, 3, 1, 3, 1, -4, -2, -2 };

		printAllSubarrays(nums);
	}

	static void printAllSubarrays(int[] nums) {
		Map<Integer, List<Integer>> hashMap = new HashMap<Integer, List<Integer>>();
		insert(hashMap, 0, -1);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (hashMap.containsKey(sum)) {
				List<Integer> list = hashMap.get(sum);
				for (Integer value : list) {
					System.out.println("subarray [" + (value + 1) + " ... " + i + "]");
				}
			}
			insert(hashMap, sum, i);
		}
	}

	static <K, V> void insert(Map<K, List<V>> hasMap, K key, V value) {
		hasMap.putIfAbsent(key, new ArrayList<>());
		hasMap.get(key).add(value);
	}

}
