package Binary_Tree;

import Binary_Tree.BT_level_order_traversal.TreeNode;

public class subtree_of_another_Tree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static void main(String[] args) {

	}

	public static boolean isIdentical(TreeNode root, TreeNode subRoot) {

		if (root == null & subRoot == null) {
			return true;
		}
		if (root == null || subRoot == null) {
			return false;
		}
		if (root.val == subRoot.val) {
			return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
		}
		return false;
	}

	public static boolean isSubTree(TreeNode root, TreeNode subRoot) {
		if (subRoot == null)
			return true;
		if (root == null)
			return false;

		if (root.val == subRoot.val) {
			if (isIdentical(root, subRoot)) {
				return true;
			}
		}

		return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);

	}
}
