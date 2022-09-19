package Striver.BinaryTree;

public class Min_depth {
	public static void main(String[] args) {

	}

	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		// Base case
		if (root.left == null && root.right == null)
			return 1;
		if (root.left == null)
			return 1 + minDepth(root.right);
		if (root.right == null)
			return 1 + minDepth(root.left);
		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}
}
