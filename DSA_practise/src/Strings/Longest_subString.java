package Strings;

import java.util.HashSet;
import java.util.Set;

public class Longest_subString {
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}

	public static int lengthOfLongestSubstring(String s) {
		if (s == null | s.isEmpty())
			return 0;

		Set<Character> window = new HashSet<Character>();
		int l = 0;
		int longestSubstring = 0;

		for (int r = 0; r < s.length(); r++) {
			char rChar = s.charAt(r);
			// updating window
			System.out.println(window.toString());
			if (window.contains(rChar)) {
				while (s.charAt(l) != rChar) {
					window.remove(s.charAt(l));
					System.out.println(window.toString()+" in if");
					l++;
				}
				l++;
			} else
				window.add(rChar);
			// update the result
			longestSubstring = Math.max(longestSubstring, r - l + 1); // imp thing is this
		}
		return longestSubstring;
	}
}
