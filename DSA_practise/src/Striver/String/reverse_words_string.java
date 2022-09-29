package Striver.String;

import java.util.Stack;

//Input: s = "the sky is blue"
//Output: "blue is sky the"
public class reverse_words_string {
	public static void main(String[] args) {
		String s = "_hello world_";
		System.out.println(reverse_using_stack(s));
//		reverse_words(s);
	}

	private static String reverse_words(String s) {
		String[] words = s.split("\\W+");
		String[] reverse = new String[words.length];
		for (int i = words.length - 1, j = 0; i >= 0 && j <= words.length - 1; i--, j++) {
//			System.out.println("words "+words[i]+""+i+" |  reverse "+reverse[j]);
			reverse[j] = words[i];
		}
		String s_new = string_array2_string(reverse, " ");
		/*
		 * for (String ss : reverse) { System.out.print(ss + " "); }
		 */
		System.out.println();
		return s_new;
	}

	static String reverse_using_stack(String s) {
		Stack<String> st = new Stack<String>();
		for (String a : s.trim().split(" ")) {
			if (!a.isEmpty()) {
				st.push(a);
			}
		}
		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty()) {
			sb.append(st.pop());
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	static String string_array2_string(String[] ss, String s) {
		StringBuilder sb = new StringBuilder();
		for (String str : ss) {
			sb.append(str).append(s);
		}
		return sb.substring(0, sb.length() - 1);
	}
}
