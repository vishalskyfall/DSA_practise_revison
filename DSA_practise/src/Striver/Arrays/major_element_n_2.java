package Striver.Arrays;

import java.util.HashMap;

//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class major_element_n_2 {
	public static void main(String[] args) {
		int a[] = new int[] { 2, 2, 1, 2, 1, 1, 1};
		System.out.println(major(a));
	}

	static int major(int[] a) {
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		int i = 0;
		while (i < a.length) {
			if (hs.containsKey(a[i])) {
				int count = hs.get(a[i]) + 1;
				if (count > a.length / 2) {
					return a[i];
				} else {
					hs.put(a[i], count);
				}
			} else {
				hs.put(a[i], 1);
			}

			i++;
		}

		return 0;
	}
}
