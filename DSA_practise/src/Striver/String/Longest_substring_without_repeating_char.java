package Striver.String;

import java.util.HashMap;

//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
public class Longest_substring_without_repeating_char {
	public static void main(String[] args) {
		System.out.println(lswrc("abcabcbb"));
	}

	private static int lswrc(String s) {
		int maxLength = 0;
		int start = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int end = 0; end < s.length(); end++) {
			if (map.containsKey(s.charAt(end))) {
				start = Math.max(start, map.get(s.charAt(end)) + 1);
			}
			map.put(s.charAt(end), end);
			// update the result
			maxLength = Math.max(maxLength, end - start + 1);
		}
		map.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " " + e.getValue());
		});
		return maxLength;
	}
}
