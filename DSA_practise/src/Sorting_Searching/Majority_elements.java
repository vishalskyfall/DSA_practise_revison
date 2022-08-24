package Sorting_Searching;

import java.util.HashMap;

public class Majority_elements {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println(majority_element(a)+" majority");
	}

	static int majority_element(int[] a) {
		HashMap<Integer, Integer> hp = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (a.length == 1)
				return a[0];

			if (hp.containsKey(a[i])) {
				int count = hp.get(a[i]) + 1;
//				System.out.println(count); count 4 thata j return a[i]
				if (count > a.length / 2)
					return a[i];
				else
					hp.put(a[i], count);
					System.out.println(count + " times " + a[i]);
			} else {
				hp.put(a[i], 1);
				System.out.println(a[i]+" added");
			}
		}
		return 0;
	}
}
