package HashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Shuffle_array_acc_given_order {
//	Input:
//		 
//		nums[] = { 1, 2, 3, 4, 5 }
//		pos[] = { 3, 2, 4, 1, 0 }
//		 
//		Output:
//		 
//		nums[] = { 5, 4, 2, 1, 3 }
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5 }; // input array
		int[] pos = { 3, 2, 4, 1, 0 }; // position array

		shuffle(nums, pos);
		System.out.println(Arrays.toString(nums));
	}

	static void shuffle(int[] nums, int[] pos) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			map.put(pos[i], nums[i]);
		}
		for (var entry : map.entrySet()) {
			nums[entry.getKey()] = entry.getValue();
		}
	}
}
