package Striver.String;

public class longest_common_string {
	public static void main(String[] args) {
		String[] strs = new String[] { "flower", "flow", "flight" };
		System.out.println(lcp(strs));
	}

	private static String lcp(String[] s) {
		if (s.length == 0)
			return "";

		String first = s[0];

		for (int i = 1; i < s.length; i++) {
			while (s[i].indexOf(first) != 0) {
				// means jyan sundhi i = string from array of string na made tyan sundhi
				// cause tyare j indexOf==0 thay
				// if yes then
				first = first.substring(0, first.length() - 1);
			}
		}

		return first;
	}
}
