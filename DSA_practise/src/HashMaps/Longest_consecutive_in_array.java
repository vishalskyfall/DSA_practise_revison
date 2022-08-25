package HashMaps;

import java.util.HashSet;

public class Longest_consecutive_in_array {

//	a=[3,20,9,10,1,2,5,4]
//	 all sequences : 20, 1 2 3 4 5, 9 10 | longest : 5 (12345)
	public static void main(String[] args) {
		int[] a = new int[] {3,9,1,10,4,20,2};
		longest(a);
	}

	static void longest(int[] a) {
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
		}
		int longest_seq = 0;
		for (int i = 0; i < a.length; i++) {
			if (!hs.contains(a[i] - 1)) {
				int number = a[i];
				while (hs.contains(number)) {
					number++;
				}
				if (longest_seq < number - a[i]) {
					longest_seq = number - a[i];// will set new longest but also find the length
					// 1 2 3 4 5 and then number++ will be 6 which is not present! so (number = 6) -
					// (a[i]=1) => length =5
				}
			}
		}
		System.out.println(longest_seq);
	}
}
