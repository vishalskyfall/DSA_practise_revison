package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import Binary_Tree.invertTree.TreeNode;

public class reverse_level_order {
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
	
	public static void reverseLevel(TreeNode root) {
		if(root==null)
			return ;
		Stack<TreeNode> stk= new Stack<>();
		Queue<TreeNode> q= new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			root = q.peek();
			q.remove();
			q.add(root.right);
			q.add(root.left);
			stk.push(root);
		}
		while(!stk.isEmpty()) {
			System.out.print(root.val);
		}
	}
}
