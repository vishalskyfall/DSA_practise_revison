package Strings;

import java.util.Stack;

/*Input: s = "bcabc"
Output: "abc"
	
	Input: s = "cbacdcbc"
	Output: "acdb"
*/
public class Remove_duplicates {
	public static void main(String[] args) {

		System.out.println("non repeating characters : " + Repeating_Char("cbacdcbc"));
	}

	static String Repeating_Char(String s) {
		// Base Case -> If s is Empty return "".
		if (s.isEmpty()) {
			return "";
		}
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		/*
		 * 
		 * int i = 0, j = s.length() - 1; while (i < s.length()/2) {
		 * System.out.println(s.charAt(i) + " " + s.charAt(j)); if (s.charAt(i) ==
		 * s.charAt(j)) { i++; } else { if (!ss.contains(s.charAt(j))) {
		 * ss.push(s.charAt(j)); } j--; } }
		 */

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!stack.contains(ch) && !stack.isEmpty()) {
				System.out.println(ch);
				// checking if top of stack is having greater element and can we get the top
				// again in string if we pop out it.
				while (!stack.isEmpty() && (int) stack.peek() > (int) ch
						&& s.substring(i, s.length()).indexOf(stack.peek()) != -1) {

					System.out.println(" " + (int) stack.peek() + " > " + (int) ch);
					System.out.println(s.substring(i, s.length()) + "  " + stack.peek() + " :->"
							+ (s.substring(i, s.length()).indexOf(stack.peek()) != -1));
					//(int) stack.peek() > (int) ch will reduce many misc. operations so

					stack.pop();
				}
				stack.push(ch);
			} else if (stack.isEmpty()) {
				stack.push(ch);
			}
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		sb.reverse();

		return sb.toString();
	}
}
