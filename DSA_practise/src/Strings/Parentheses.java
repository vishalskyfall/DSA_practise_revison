package Strings;

import java.util.Stack;

public class Parentheses {
	public static void main(String[] args) {
		String s = "]";
		boolean f = isParentheses(s);
		System.out.println("Is this above String Parentheses ? " + f);
	}

	static boolean isParentheses(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}
			else if (stack.isEmpty() || stack.pop() != c)
	            return false;
		}
		return stack.isEmpty();

	}
}
