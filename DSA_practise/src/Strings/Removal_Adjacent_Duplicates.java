package Strings;

import java.util.Stack;

public class Removal_Adjacent_Duplicates {
	public static void main(String[] args) {
		String s = "abbaca";
		removal_adjacent(s);
	}

	static void removal_adjacent(String s) {
		/*
		 * HashSet<Character> hs = new HashSet<Character>(); for (Character c :
		 * s.toCharArray()) { if (!hs.add(c)) { System.out.println(c); hs.remove(c); } }
		 * System.out.println(hs);
		 */
		int i = s.length() - 1;
		Stack<Character> ss = new Stack<>();
		/*
		 * ss.add('c'); ss.add('a'); ss.add('c'); boolean b= ss.contains('c'); if(b)
		 * ss.remove(2);
		 */

//		char[] c = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		while (i >= 0) {
			char ch = s.charAt(i);
			System.out.println(ss.contains(ch) + " " + ch + " " + ss);
			if (ss.isEmpty()) {
				ss.push(ch);
			} else if (ss.peek() == ch && !ss.isEmpty()) {
//				ss.add(ch);
				ss.pop();
//				ss.remove(ch);
			} else {
				ss.push(ch);
			}
			i--;
		}

		while (!ss.isEmpty()) {
			sb.append(ss.pop());
		}
		System.out.println(sb.toString());
	}
}
