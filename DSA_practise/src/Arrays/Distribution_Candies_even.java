package Arrays;

import java.util.HashSet;

public class Distribution_Candies_even {

	public static void main(String[] args) {
		int[] a = {1,1,2,3};
		int res = dis(a);
		System.out.println("Candies Vishal can eat : " + res);
	}

	static int dis(int[] a) {
		if ((a.length) % 2 != 0) {
			return 0;
		}
		int count = 0;
		// to find duplicates
		HashSet<Integer> hs = new HashSet<Integer>();
		for (Integer i : a) {
			if (!hs.add(i)) {
				count++;
			}
		}
		int res = a.length/2< a.length-count? a.length/2 :a.length-count;
		return res ;
	}
}
