package Striver.BinaryTree;

import java.util.ArrayList;

public class Lowest_common_Ancestor {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);

		TreeNode res = lowestCommon_ancestor(root, root.left.left, root.left.right);
		System.out.println(res.val);
	}

	public static TreeNode lowestCommon_ancestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null)
			return null;

		ArrayList<TreeNode> list1 = nodeToRootPath(root, p);
		ArrayList<TreeNode> list2 = nodeToRootPath(root, q);

		for (TreeNode k : list1) {
			System.out.print(" " + k.val);
		}
		System.out.println();
		for (TreeNode k : list2) {
			System.out.print(" " + k.val);
		}
		System.out.println();
		TreeNode lca = null;

		int i = list1.size() - 1;
		int j = list2.size() - 1;

		while (i >= 0 && j >= 0) {
			TreeNode n1 = list1.get(i);
			TreeNode n2 = list2.get(j);

			System.out.println(n1.val + " " + n2.val);
			if (n1 == n2) {
				lca = n1;
				i--;
				j--;
			} else {
				break;
			}

		}
		System.out.println(lca.val + " lca");
		return lca;
	}

	private static ArrayList<TreeNode> nodeToRootPath(TreeNode node, TreeNode findNode) {

		if (node == null)
			return new ArrayList<>();

		if (node.val == findNode.val) {
			ArrayList<TreeNode> list = new ArrayList<>();
			list.add(node);
			return list;
		}

		ArrayList<TreeNode> lList = nodeToRootPath(node.left, findNode);
		if (lList.size() > 0) {
			lList.add(node);
			return lList;
		}

		ArrayList<TreeNode> rList = nodeToRootPath(node.right, findNode);
		if (rList.size() > 0) {
			rList.add(node);
			return rList;
		}

		return new ArrayList<>();
	}
}
