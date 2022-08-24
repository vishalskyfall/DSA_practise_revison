package Strings;

public class Longest_palindrome_substring {
	public static void main(String[] args) {
		System.out.println(long_palin_suns("cbbd"));
	}

	static String long_palin_suns(String s) {
		if (s.isEmpty()) {
			return null;
		}

		if (s.length() == 1) {
			return s;
		}

		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length(); i++) {

			// get longest palin with center of i
			String temp = ispalin(s, i, i);
//			System.out.println(i + " "+temp);
			if (temp.length() > longest.length()) {
				longest = temp;
			}

			// get longest palin from center of i & i+1
			temp = ispalin(s, i, i + 1);
//			System.out.println(i + " "+temp+" center of i & i+1");
			if (temp.length() > longest.length()) {
				longest = temp;
			}

		}
		return longest;
	}

	static String ispalin(String s, int k, int v) {
		while (k >= 0 && v <= s.length()-1 && s.charAt(k) == s.charAt(v)) {
			k--;
			v++;
		}
		return s.substring(k + 1, v);
	}

}
