package HashMaps;

import java.util.LinkedList;
import java.util.List;

public class array_canBEdivided_pairs_sumbyk {

//	arr[] = { 3, 1, 2, 6, 9, 4 }
//	k = 5
//	 
//	Output: Pairs can be formed
//	 
//	Explanation: Array can be divided into pairs {(3, 2), (1, 9), (4, 6)} where the sum of elements in each pair is divisible by 5.
	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 6, 9, 4 };
		int k = 5;

		if (findPairs(arr, k) != 0) {
			System.out.println("Pairs can be formed");
		} else {
			System.out.println("Pairs cannot be formed");
		}
	}

	static int findPairs(int[] a, int k) {
		List<Integer> ls = new LinkedList<Integer>();
		for (int p : a) {
			ls.add(p);
		}
		for (int i = 0; i < ls.size(); i++) {
			if (!ls.contains(Math.abs(k - ls.get(i)))) {
				return 0;
			}
		}
		return 1;
	}
}
