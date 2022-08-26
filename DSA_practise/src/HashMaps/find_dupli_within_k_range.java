package HashMaps;

import java.util.HashMap;

public class find_dupli_within_k_range {
//	nums[] = { 5, 6, 8, 2, 4, 6, 9 }
//	k = 4
//	 
//	Output: Duplicates found
//	 
//	(element 6 repeats at distance 4 which is <= k)

	public static void main(String[] args) {
		int[] nums = { 5, 6, 8, 2, 4, 6, 9 };
		int k = 4;

		if (hasDuplicate(nums, k)) {
			System.out.println("Duplicates found");
		} else {
			System.out.println("No duplicates were found");
		}
	}

	static boolean hasDuplicate(int[] a, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				if ((i - map.get(a[i])) <= k) { // like from particular index if you found means contains
					// then check index(of new 6( - get[i](which is old 6) 1-5 = 4 <=k(which is 4)
					// so true;
					return true;
				}
			} else
				map.put(a[i], i); // else add
		}
		return false;
	}
}
