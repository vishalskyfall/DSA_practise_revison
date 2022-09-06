package Striver.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class LeftView {

	public static void main(String[] args) {

	}

	static ArrayList<Integer> leftView(Node root) {

		ArrayList<Integer> ls = new ArrayList<Integer>();
		if (root == null)
			return null;

		Stack<Node> s = new Stack<Node>();
		s.push(root);

		while (!s.isEmpty()) {
			Node nn = s.peek();
			ls.add(nn.data);
			s.pop();

			if (nn.left != null) {

				s.push(nn.left);
			} else if (nn.right != null) {
				s.push(nn.right);
			}
//			s.pop();
		}
		return ls;
	}

	ArrayList<Integer> leftView_2(Node root) {
		// Your code here
		HashMap<Integer, Integer> map = new HashMap<>();
		findAllLeftNodes(root, 1, map);
		ArrayList<Integer> list = new ArrayList<>();
		for (int key : map.keySet())
			list.add(map.get(key));
		return list;

	}

	static void findAllLeftNodes(Node root, int level, HashMap<Integer, Integer> map) {
		if (root == null)
			return;
		if (!map.containsKey(level))
			map.put(level, root.data);
		findAllLeftNodes(root.left, level + 1, map);
		findAllLeftNodes(root.right, level + 1, map);
	}

}
