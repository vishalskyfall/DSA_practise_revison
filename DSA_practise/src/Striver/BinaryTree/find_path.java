package Striver.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class find_path {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
	   root.left.right.left = new Node(6);
     root.left.right.right = new Node(7);

		List<Integer> ls = new ArrayList<Integer>();
		boolean res;
		res = findPath(5, root, ls);

		for (int i : ls) {
			System.out.println(i);
		}
	}

	private static boolean findPath(int b, Node root, List<Integer> ls) {
		if (root == null)
			return false;

		ls.add(root.data);
		if (root.data == b) {
			return true;
		}
		if (findPath(b, root.left, ls) || findPath(b, root.right, ls))
			return true;

		ls.remove(ls.size() - 1);

		return false;
	}

}
