package Striver.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Input:
//N = 3
//arr = {5, 2, 1}
//Output:
//	subsets : [], 1,2,5,(1,2),(1,5),(5,2),(1,2,5)
//	
//0 1 2 5 3 6 7 8

public class Subset_sums {
	public static void main(String[] args) {
		int num[] = new int[] { 2,3 };
		List<List<Integer>> ls = subsetsWithDup(num);
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(0,0);
		for (int i = 0; i < ls.size(); i++) {
//			System.out.print(ls.get(i));
			for (int j = 0; j < ls.get(i).size(); j++) {
				int check = ls.get(i).get(ls.get(i).size() - 1);
				if (!al.contains(check)) {
					al.add(check);
				}
			}
		}
		Collections.sort(al);
//		System.out.println(ls);
		System.out.println(al);
	}

	private static List<List<Integer>> subsetsWithDup(int[] nums) {
		int len = nums.length;
		int possible = 1 << len; // for 1 2 3 => 3 means 2^3 = 8 total subsets
		// 1<<3 => 8
//		System.out.println(len + " " + possible);
		Map<List<Integer>, Integer> map = new HashMap<List<Integer>, Integer>();
		Arrays.sort(nums);
		for (int i = 0; i < possible; i++) {
			List<Integer> entry = new ArrayList<Integer>();
			int sum = 0;
			for (int j = 0; j < len; j++) {
//				System.out.println(i + " " + (1 << j));
				// 1<<0 = 1
				// 1<<1 = 2
				// 1<<2 = 4
				if ((i & (1 << j)) != 0) {
//					System.out.println(1<<j);
					sum += nums[j];
					entry.add(sum);
				}
			}
			if (map.containsKey(entry) == false) {
				map.put(entry, 1);
			}
		}
		return new ArrayList<>(map.keySet());
	}
}
