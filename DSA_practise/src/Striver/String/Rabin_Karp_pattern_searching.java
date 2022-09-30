package Striver.String;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rabin_Karp_pattern_searching {
	public static void main(String[] args) {
		String txt = "THIS IS A TEST TEXT";
		String pat = "TEST";
		via_pattern(txt, pat);
		System.out.println(findWord(txt, pat));
	}

	private static void via_pattern(String s, String ss) {
		Pattern p = Pattern.compile(ss);
		Matcher matcher = p.matcher(s);
		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end());
			System.out.println(" Found: " + matcher.group());
		}
	}

	static List<Integer> findWord(String s, String ss) {
		List<Integer> indexes = new LinkedList<Integer>();
		StringBuilder op = new StringBuilder();
		String lowerString = s.toLowerCase();
		String lowerWord = ss.toLowerCase();
		int wordCount = 0;
		int index = 0;

		while (index != -1) {
			index = lowerString.indexOf(lowerWord, index + wordCount);
			if (index != -1) {
				indexes.add(index);
			}
			wordCount = ss.length();
		}
		return indexes;
	}
}
