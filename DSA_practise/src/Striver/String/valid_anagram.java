package Striver.String;

import java.util.HashMap;
import java.util.Map;

//Input: s = "anagram", t = "nagaram"
//Output: true

public class valid_anagram {
	public static void main(String[] args) {

		String s1 = "anagram";
		String s2 = "nagaram";
		System.out.println(isAnagram(s1, s2));
	}

	private static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		//// key , value
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : s1.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Character v : s2.toCharArray()) {
			if (map.containsKey(v) && map.get(v) > 0) {
				map.put(v, map.get(v) - 1);
			} else {
				return false;
			}
		}
		return true;
	}
}
