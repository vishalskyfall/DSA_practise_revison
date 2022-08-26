package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class Anagrams_string_hash {
	public static void main(String[] args) {
		System.out.println(isAnagram("aacc", "ccac"));
	}

	static boolean isAnagram(String s, String t) {
		/*
		 * if (s1.length() == s2.length()) { HashSet<Character> hs = new
		 * HashSet<Character>(); for (int i = 0; i < s1.length(); i++) {
		 * hs.add(s1.charAt(i)); } for (Character p : s2.toCharArray()) { if
		 * (!hs.contains(p)) { return false; } } return true; } return false;
		 */ 
		
		//hashset can create issues when we get duplicates so use hashmaps
		
		

        if (s.length() != t.length())
			return false;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			// System.out.println(map.containsKey(c));
			if (map.containsKey(c)) {
				// System.out.println(map.get(c));
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
			// for "anga"
			// btw first check ma containsKey ma false avse and put as 1 thase badhama
			// so "a n g" false then again a = 1 +1 set thase because already there
			// tc ma "n a g a" -> n is there and >0 so -- => 0 thai jase same for a =1 and g
			// =0
			// again a ma 0 thase and loop ends . . . if >0 tc ma na male key then false
		}
		for (Character tc : t.toCharArray()) {
			if (map.containsKey(tc) && map.get(tc) > 0) {
				// System.out.println(map.get(tc));
				map.put(tc, map.get(tc) - 1);
			} else {
				return false;
			}
		}
		return true;
	}
}
