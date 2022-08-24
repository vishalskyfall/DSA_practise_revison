package Strings;

public class LCS {
	public static void main(String[] args) {

		String s[] = { "acbcde", "ace", "acde", "acb" };
		String ss = lcs(s);
		System.out.println(ss);
	}

	static String lcs(String[] s) {
		/*
		 * String first = s[0]; String last = s[s.length - 1]; String res = ""; for (int
		 * i = 0; i < first.length(); i++) { if (first.charAt(i) == last.charAt(i)) {
		 * res += first.charAt(i); } else { break; } } return res;
		 */
		if (s.length == 0)
			return "";

		String first = s[0];
		for (int i = 1; i < s.length; i++) {
			System.out.println(s[i]+" - "+s[i].indexOf(first) );
			while (s[i].indexOf(first) != 0) { // ss.indexOf('s') e index ape , jab tak aa 0 na thay
				// means exact na male "first" tab tak while
				first = first.substring(0, first.length() - 1);
				System.out.println(first);
			}
		}
		return first;

	}
}
