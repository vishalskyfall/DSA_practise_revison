package Binary_Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Binary_Tree.BinaryTree_from_array.Node;

public class BT_level_order_traversal {

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
 //only code in function check otherwise go to -> binarytree from array		
	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> lss = new ArrayList<List<Integer>>();

		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		q.add(null);

		while (!q.isEmpty()) {
			List<Integer> ls = new ArrayList<Integer>();
			int level = q.size();

//				System.out.println(currNode.val);

			for (int i = 0; i < level; i++) {
				TreeNode currNode = q.poll();
				if (currNode != null) {
					ls.add(currNode.val);
					q.add(currNode.left);
					q.add(currNode.right);
				}
			}
			lss.add(ls);
		}
		lss.remove(lss.size() - 1);
		return lss;

	}

	public static void LevelOrder(Node root) { // FIFO Queue
		// siblings pela children add thai jay with null
		// breadth first

		if (root == null)
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		q.add(null);

		while (!q.isEmpty()) {
			Node currNode = q.remove();
			if (currNode == null) {
				System.out.println();
				if (q.isEmpty()) {
					break;
				} else {
					q.add(null);
				}
			} else {
				System.out.println(currNode.data);
				if (currNode.left != null) {
					q.add(currNode.left);
				}
				if (currNode.right != null) {
					q.add(currNode.right);
				}
			}
		}
	}
}
