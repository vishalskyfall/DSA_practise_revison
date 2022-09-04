package Binary_Tree;

public class balanced_BT {
	public static void main(String[] args) {
		TreeNode n = new TreeNode();
//		n.left = new TreeNode(9);
//		n.right = new TreeNode(20);
//		n.left.left = new TreeNode();
//		n.left.right = new TreeNode();
//		n.right.left = new TreeNode(15);
//		n.right.right = new TreeNode(7);

		System.out.println(isBalanced(n));
	}

	public static boolean res = true;

	public static boolean isBalanced(TreeNode root) {
	  if(root==null)
      return res;
 	
		check_depth(root);
		return res;
	}

	public static int check_depth(TreeNode root) {
		if (root == null)
			return 0;

		int leftD = check_depth(root.left);
		int rightD = check_depth(root.right);

		if (Math.abs(leftD - rightD) > 1) {
			res = false;
		}

		return Math.max(leftD, rightD) + 1;
	}
}
