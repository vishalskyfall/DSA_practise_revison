package Striver.Arrays;

import java.util.HashMap;

//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
//Therefore its length is 4.

public class Longest_Consecutive_Sequence {
	public static void main(String[] args) {
		int[] a = new int[] { 1, 2, 3, 100, 4, 200 };
		int ans = longestCS(a);
		System.out.println(ans);
	}

	static int longestCS(int[] a) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int ans = 0;
		for (int n : a) {
			map.put(n, true);// making all true first
		}

		for (int n : a) {
			if (map.containsKey(n - 1)) {
				map.replace(n, false); // replacing if already found
			}
		}
		

		for (int n : a) {
			if (map.get(n)) { //if contains 
				int len = 1;
				while (map.containsKey(n + len)) {  //checking if consecutive one is there ? 
					len++;
				}
				if (ans < len) {
					ans = len;
				}
			}
		}
		map.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " " + e.getValue());
		});
		return ans;

	}
}
