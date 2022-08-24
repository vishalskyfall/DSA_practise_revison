package HashMaps;

import java.util.HashMap;
import java.util.Map;

//
//nums[] = { 5, 6, -5, 5, 3, 5, 3, -2, 0 }
//target = 8
// 
// 
//Subarrays with sum 8 are
// 
//{ -5, 5, 3, 5 }
//{ 3, 5 }
//{ 5, 3 }
// 
//The longest subarray is { -5, 5, 3, 5 } having length 4
public class max_length_subArray {
	public static void main(String[] args) {
		int[] nums = { 5, 6, -5, 5, 3, 5, 3, -2, 0 };
		int target = 8;

		findMaxLenSubarray(nums, target);
	}

	static void findMaxLenSubarray(int[] a, int t) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, -1);
		int target = 0;
		int len = 0;
		int end = -1;
		for (int i = 0; i < a.length; i++) {
			target += a[i];
			map.putIfAbsent(target, i);
			System.out.println("map : "+map.get(i));
			System.out.println(map.containsKey(target - t)+" "+(target-t)+" "+i+" "+map.get(target - t));
			if (map.containsKey(target - t) && len < i - map.get(target - t)) {
				len = i - map.get(target - t);
				end = i;
			}
		}
		System.out.println("[" + (end - len + 1) + "," + end + "]");
	}
}
