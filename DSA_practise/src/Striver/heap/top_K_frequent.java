package Striver.heap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

//Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]

public class top_K_frequent {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 1, 1, 1, 2, 2, 2, 3, 3, 9, 9, 9, 9, 9, 5 };
		int k = 2;
		int[] ans = freq_K(a, k);
		for (Integer i : ans) {
			System.out.print(i + " ");
		}
//		System.out.println(" " + ans.length);
		System.out.println();

	}

	private static int[] freq_K(int[] a, int k) {
		if (a.length <= 1)
			return new int[] { 1 };

		HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
		int i = 0;
		while (i < a.length) {
			if (hp.containsKey(a[i])) {
//				System.out.println(hp.get(a[i]));
				hp.put(a[i], hp.get(a[i]) + 1);
			} else {
				hp.put(a[i], 1);
			}
			i++;
		}

		LinkedList<Integer> ls = new LinkedList<Integer>(hp.keySet());
		Collections.sort(ls, (c, b) -> hp.get(b) - hp.get(c));
//		hp.entrySet().forEach(entry -> {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//			if (entry.getValue() > 1) {
//				ls.add(entry.getKey());
//			}
//		});
//		System.out.println(ls.get(0) + " " + ls.get(1));
//		System.out.println(vans.length);

		int[] vans = new int[k];
		for (int j = 0; j < k; j++) {
			vans[j] = ls.get(j);
		}
		return vans;
	}
}
