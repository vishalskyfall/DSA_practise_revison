package Binary_Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Same_Leaf_tree {

	public static void main(String[] args) {
		TreeNode n = new TreeNode(3);
		n.left = new TreeNode(5);
		n.left.left = new TreeNode(6);
		n.left.right = new TreeNode(2);
		n.left.right.left = new TreeNode(7);
		n.left.right.right = new TreeNode(4);

		n.right = new TreeNode(1);
		n.right.left = new TreeNode(9);
		n.right.right = new TreeNode(8);

		TreeNode m = new TreeNode(3);
		m.left = new TreeNode(5);
		m.left.left = new TreeNode(6);
		m.left.right = new TreeNode(7);

		m.right = new TreeNode(1);
		m.right.left = new TreeNode(4);
		m.right.right = new TreeNode(2);
		m.right.right.left = new TreeNode(9);
		m.right.right.right = new TreeNode(8);

		System.out.println(leafSimilar(n, m));
	}

	public static boolean leafSimilar(TreeNode p, TreeNode q) {
		List<Integer> ls = new LinkedList<Integer>();
		check(p, ls);
		List<Integer> ps = new LinkedList<>();
		check(q, ps);
		/*
		 * // System.out.println(ps.size() + " " + ls.size()); if (ls.size() ==
		 * ps.size() && ls.size() > 1 && ls.size()!=0) { for (int i = 0; i < ls.size();
		 * i++) { // System.out.println(ls.get(i) + " " + ps.get(i)); if (ls.get(i) !=
		 * ps.get(i)) { return false; } } }
		 */
		return ls.equals(ps);
	}

	public static void check(TreeNode root, List<Integer> ls) {

		if (root == null)
			return ;
		else {
			if (root.left == null && root.right == null) {
//		        System.out.print(root.val + " ");
				ls.add(root.val);
			}
				check(root.left, ls);
				check(root.right, ls);
			
		}
//		if (root.left != null)
//			check(root.left, ls);
//		if (root.right != null)
//			check(root.right, ls);


	}
}
