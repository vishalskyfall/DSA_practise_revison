package Binary_Tree;

class TreeNode {
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

public class Same_Tree {

	public static void main(String[] args) {
		TreeNode n = new TreeNode(1);
		n.left = new TreeNode(2);
		n.right = new TreeNode(3);

		TreeNode m = new TreeNode(1);
		m.left = new TreeNode();
		m.right = new TreeNode(3);

		System.out.println(isSameTree(n, m));
	}

	public static int check_depth(TreeNode root) {
		if (root == null)
			return 0;

		int leftD = check_depth(root.left);
		int rightD = check_depth(root.right);
		return leftD + rightD + 1;
	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;

		if (check_depth(p) != check_depth(q)) {
			return false;
		}

		if (p.val == q.val) {
			return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		}

		return false;
	}
}
