package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]*/
public class Group_Anagram {
	public static void main(String[] args) {
		List<List<String>> al = new ArrayList<>();
		String[] sl = { "eat", "tea", "tan", "ate", "nat", "bat" };
		al =groupAnagrams(sl);
		al.toString();
		System.out.println(al);
	}

	static List<List<String>> groupAnagrams(String[] str) {
		Map<String, List<String>> groupMap = new HashMap<String, List<String>>();
		for (String s : str) {
			char[] c = s.toCharArray();
//			System.out.println(c);
			Arrays.sort(c);
//			System.out.println(s);
			String sortedWord = String.valueOf(c);
			System.out.println(sortedWord);
			if (groupMap.containsKey(sortedWord)) {
				groupMap.get(sortedWord).add(s); 
//				System.out.println(groupMap.get(sortedWord).add(s)); // true or false ave
			} else {
				List<String> group = new ArrayList<>();
				group.add(s); // list ma add karine e sortedword same put 
				groupMap.put(sortedWord, group);
			}

		}
		return new ArrayList<>(groupMap.values());

	}
}
