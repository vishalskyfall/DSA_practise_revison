package Striver.BinaryTree;

import java.util.ArrayList;
import java.util.Stack;

public class Inorder_PreOrder_PostOrder_Traversal {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
//		root.left.right.left = new Node(8);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
//		root.right.right.left = new Node(9);
//		root.right.right.right = new Node(10);

		ArrayList<Integer> inOrder = new ArrayList<Integer>();
		ArrayList<Integer> preOrder = new ArrayList<Integer>();
		ArrayList<Integer> postOrder = new ArrayList<Integer>();
		inOrder = inOrderList(root);
//		inOrderList(root, inOrder);
		System.out.println("List : \" In Order \"");
		for (int i = 0; i < inOrder.size(); i++) {
			System.out.print(inOrder.get(i) + " ");
		}
		System.out.println();

//		preOrder = preOrderList(root);
		preOrderList(root, preOrder);
		System.out.println("List : \" Pre Order \"");
		for (int i = 0; i < preOrder.size(); i++) {
			System.out.print(preOrder.get(i) + " ");
		}
		System.out.println();

		postOrder = postOrderList(root);
//		postOrderList(root, postOrder);

		System.out.println("List : \" Post Order \"");
		for (int i = 0; i < postOrder.size(); i++) {
			System.out.print(postOrder.get(i) + " ");
		}
	}

	private static ArrayList<Integer> inOrderList(Node root) {

		ArrayList<Integer> ls = new ArrayList<Integer>();
		Stack<Node> s = new Stack<Node>();
		while (true) {
			if (root != null) {
				s.push(root);
				root = root.left;
			} else {
				if (s.isEmpty())
					break;
				root = s.peek();
				ls.add(root.data);
				s.pop();
				root = root.right;
			}
		}
		return ls;
	}

	static void inOrderList(Node root, ArrayList<Integer> ls) {
		if (root == null)
			return;

		inOrderList(root.left, ls);
		ls.add(root.data);
		inOrderList(root.right, ls);
	}

	private static ArrayList<Integer> preOrderList(Node root) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		if (root == null) {
			return ls;
		}

		Stack<Node> s = new Stack<Node>();
		s.push(root);

		while (!s.isEmpty()) {
			Node topNode = s.peek();
			ls.add(topNode.data);
			s.pop();

		
			if (topNode.left != null)
				s.push(topNode.left);
			if (topNode.right != null)
				s.push(topNode.right);
		}
		return ls;
	}

	static void preOrderList(Node root, ArrayList<Integer> ls) {
		if (root == null)
			return;

		ls.add(root.data);
		preOrderList(root.left, ls);
		preOrderList(root.right, ls);
	}

	private static ArrayList<Integer> postOrderList(Node root) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		if (root == null)
			return ls;

		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);

		while (!s1.isEmpty()) {
			root = s1.peek();
			s1.pop();
			s2.push(root);
			if (root.left != null)
				s1.push(root.left);
			if (root.right != null)
				s1.push(root.right);
		}
		while (!s2.isEmpty()) {
			ls.add(s2.peek().data);
			s2.pop();
		}
		return ls;
	}

	static void postOrderList(Node root, ArrayList<Integer> ls) {
		if (root == null)
			return;

		postOrderList(root.left, ls);
		postOrderList(root.right, ls);
		ls.add(root.data);
	}

}
