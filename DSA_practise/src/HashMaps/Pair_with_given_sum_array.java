package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Pair_with_given_sum_array {
//
//	Input:
//		 
//		nums = [8, 7, 2, 5, 3, 1]
//		target = 10
//		 
//		Output:
//		 
//		Pair found (8, 2)
//		or
//		Pair found (7, 3)
	public static void main(String[] args) {
		int[] a = new int[] { 8, 7, 2, 5, 3, 1 };
		int target = 10;
		findPair(a, target);
	}

	static void findPair(int[] a, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(target - a[i])) {
				System.out.printf("Pair found (%d,%d)", a[map.get(target - a[i])], a[i]);
//				return;
			}
			map.put(a[i], i);
		}
		System.out.println("pair not found");
	}
}
