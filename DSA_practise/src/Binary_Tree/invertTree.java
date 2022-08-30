package Binary_Tree;

import Binary_Tree.BT_level_order_traversal.TreeNode;

public class invertTree {
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

	public TreeNode invertTree(TreeNode root) {
		root = invertC(root);
		return root;
	}

	public static TreeNode invertC(TreeNode root) {
		if (root == null)
			return root;

		TreeNode leftN = invertC(root.right);
		TreeNode rightN = invertC(root.left);

		root.left = leftN;
		root.right = rightN;

		return root;
	}
}
