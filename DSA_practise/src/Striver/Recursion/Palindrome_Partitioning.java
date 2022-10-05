package Striver.Recursion;

import java.util.ArrayList;
import java.util.List;

//Input: s = "aab"
//Output: [["a","a","b"],["aa","b"]]
//		

public class Palindrome_Partitioning {
	public static void main(String[] args) {
		List<List<String>> ans = partition("vishala");
		System.out.println(ans);
	}

	public static List<List<String>> partition(String s) {
		List<String> res = new ArrayList<String>();
		List<List<String>> ans = new ArrayList<List<String>>();
		solve(s, res, ans);

		return ans;
	}

	private static void solve(String s, List<String> res, List<List<String>> ans) {
		if (s.length() == 0) {
			ans.add(new ArrayList<String>(res));
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			String l = s.substring(0, i + 1);
			if (isPalindrome(l)) {
				String r = s.substring(i + 1);
				res.add(l);

				solve(r, res, ans);

				if (res.size() != 0)
					res.remove(res.size() - 1);
			}
		}
	}

	public static boolean isPalindrome(String s) {
		if (s.length() == 1)
			return true;

		int l = s.length();
		for (int i = 0; i < l / 2; i++) {
			if (s.charAt(i) != s.charAt(l - i - 1))
				return false;
		}

		return true;
	}
}
