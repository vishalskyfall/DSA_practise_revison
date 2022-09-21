package Striver.BinaryTree;

import java.util.ArrayList;

public class Boundary_Traversal {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(3);
		root.left.left.right = new Node(4);
		root.left.left.right.left = new Node(5);
		root.left.left.right.right = new Node(6);

		root.right = new Node(7);
		root.right.right = new Node(8);
		root.right.right.left = new Node(9);
		root.right.right.left.left = new Node(10);
		root.right.right.left.right = new Node(11);

		ArrayList<Integer> ans = new ArrayList<>();
		ans = Boundary(root);
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(" " + ans.get(i));
		}
		System.out.println();
	}

	private static ArrayList<Integer> Boundary(Node root) {
		ArrayList<Integer> ans = new ArrayList<>();
		if (isLeaf(root) == false) {
			ans.add(root.data);
		}
		addLeftBoundary(root, ans);
		addLeaves(root, ans);
		addRightBoundary(root, ans);

		return ans;

	}

	private static void addRightBoundary(Node root, ArrayList<Integer> al) {
		Node cur = root.right;
		ArrayList<Integer> temp = new ArrayList<>();
		while (cur != null) {
			if (isLeaf(cur) == false)
				temp.add(cur.data);
			if (cur.right != null)
				cur = cur.right;
			else
				cur = cur.left;
		}
		int i = 0;
		for (i = temp.size() - 1; i >= 0; i--) {
			al.add(temp.get(i));
		}

	}

	private static void addLeaves(Node root, ArrayList<Integer> al) {
		if (isLeaf(root)) {
			al.add(root.data);
		}
		if (root.left != null)
			addLeaves(root.left, al);
		if (root.right != null)
			addLeaves(root.right, al);

	}

	private static void addLeftBoundary(Node root, ArrayList<Integer> al) {
		Node cur = root.left;
		while (cur != null) {
			if (isLeaf(cur) == false)
				al.add(cur.data);
			if (cur.left != null)
				cur = cur.left;
			else
				cur = cur.right;
		}

	}

	private static boolean isLeaf(Node root) {
		if (root == null)
			return false;
		if (root.left == null && root.right == null)
			return true;
//		return isLeaf(root.left) || isLeaf(root.right);
		return false;
	}
}
