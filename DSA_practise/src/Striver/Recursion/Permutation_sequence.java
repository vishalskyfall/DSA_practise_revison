package Striver.Recursion;

import java.util.ArrayList;
import java.util.List;

//Input: n = 3, k = 3
//Output: "213"
//	kth permuation of 123 
//	n=3 so 123
//	n= 4 then 1234
public class Permutation_sequence {
	public static void main(String[] args) {
		String ans = getAns(4,9);
		System.out.println(ans);
	}

	private static String getAns(int n, int k) {
		if (n < 1 || n > 9) {
			return "";
		}

		int fact = 1;
		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			fact = fact * i;
			numbers.add(i);
		}
		numbers.add(n);
//		System.out.println(numbers);
		String pre = "";
		for (Integer i : numbers) {
			pre += Integer.toString(i);
		}
//		System.out.println(pre + " question");
		List<String> ls = new ArrayList<String>();
		permutation("", pre, ls);
//		System.out.println(ls.get(k));
		return ls.get(k-1);
	}

	private static List<String> permutation(String prefix, String str, List<String> ls) {

		int n = str.length();
		if (n == 0) {
			ls.add(prefix);
//			System.out.println(prefix);
			// return prefix;
		} else {
			for (int i = 0; i < n; i++) {

				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), ls);
			}
		}
//		System.out.println(ls);
		return ls;
	}
}
