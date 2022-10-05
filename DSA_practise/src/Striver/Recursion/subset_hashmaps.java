package Striver.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Input: nums = [1,2,2]
//Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

public class subset_hashmaps {
	public static void main(String[] args) {
		int num[] = new int[] { 5,2,1};
		List<List<Integer>> ls = subsetsWithDup(num);
		System.out.println(ls);
	}

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		int len = nums.length;
		int possible = 1 << len; // for 1 2 3 => 3 means 2^3 = 8 total subsets
		// 1<<3 => 8
//		System.out.println(len + " " + possible);
		Map<List<Integer>, Integer> map = new HashMap<List<Integer>, Integer>();
		Arrays.sort(nums);
		for (int i = 0; i < possible; i++) {
			List<Integer> entry = new ArrayList<Integer>();
			for (int j = 0; j < len; j++) {
//				System.out.println(i + " " + (1 << j));
				// 1<<0 = 1
				// 1<<1 = 2
				// 1<<2 = 4
				if ((i & (1 << j)) != 0) {
//					System.out.println(1<<j);
					entry.add(nums[j]);
				}
			}
			if (map.containsKey(entry) == false) {
				map.put(entry, 1);
			}
		}
		return new ArrayList<>(map.keySet());
	}
}
