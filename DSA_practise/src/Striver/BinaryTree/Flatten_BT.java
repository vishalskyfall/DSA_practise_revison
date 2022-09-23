package Striver.BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class Flatten_BT {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(5);
		root.left.left = new Node(3);
		root.left.right = new Node(4);
		root.right.right = new Node(6);

		preOrder(root);

	}

	private static void preOrder(Node root) {
//		ArrayList<Integer> pre = new ArrayList<Integer>();
		if (root == null) {
			return;
		}
		Stack<Node> s = new Stack<Node>();
		s.add(root);
		while (!s.isEmpty()) {
			Node n = s.pop();
//			pre.add(n.data);

			if (n.right != null) {
				s.add(n.right);
			}
			if (n.left != null) {
				s.add(n.left);
			}
			if (!s.isEmpty()) {
				n.right = s.peek();
			} else {
				break;
			}
			n.left=null;
		}

	}
}
