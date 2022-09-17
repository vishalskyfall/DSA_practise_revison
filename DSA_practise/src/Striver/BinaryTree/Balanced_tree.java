package Striver.BinaryTree;

class TreeNode {
	int val;
	TreeNode left, right;

	public TreeNode() {

	}

	TreeNode(int val) {
		this.val = val;
		left = null;
		right = null;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class Balanced_tree {
	public static boolean res = true;

	public static void main(String[] args) {

//		a binary tree in which the left and right subtrees of every node 
		// differ in height by no more than 1.

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(15);
//		root.right.right= new TreeNode(5);
//		root.left.left = new TreeNode(7);
		System.out.println(isBalanced(root));
	}

	static boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;

		if (check_depth(root) == -1) {
			return false;
		} else
			return true;
	}

	static int check_depth(TreeNode root) {
		if (root == null)
			return 0;

		int leftD = check_depth(root.left);
		int rightD = check_depth(root.right);
		System.out.println(leftD+" leftD "+root.val+" || "+rightD+" rightD "+root.val);

		if (Math.abs(leftD - rightD) > 1 || leftD == -1 || rightD == -1) {
			return -1;
		} else
			return Math.max(leftD, rightD) + 1;
	}
}
