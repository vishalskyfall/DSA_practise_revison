package Striver.Arrays;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

//Input: nums = [3,2,3]
//Output: [3]

public class majority_elements {
	public static void main(String[] args) {
		int[] a = new int[] { 3,2,3 };
		List<Integer> ls = major(a);
		System.out.println(ls);
	}

	private static List<Integer> major(int[] a) {
		List<Integer> ls = new LinkedList<Integer>();
		int n = a.length;
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		map.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " " + e.getValue());
			if (e.getValue() > (n / 3)) {
				ls.add(e.getKey());
			}
		});

		return ls;
	}
}
