package Binary_Tree;

import Binary_Tree.Count_sum_nodes.Binary_Tree;
import Binary_Tree.Count_sum_nodes.Node;

public class height_tree {
	static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	static class Binary_Tree {
		static int idx = -1;

		public static Node buildTree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newNode = new Node(nodes[idx]);
			newNode.left = buildTree(nodes);
			newNode.right = buildTree(nodes);

			return newNode;
		}
	}
	 public static int maxDepth(Node root) {
		 if(root==null)
			 return 0;
	        int leftHeight = maxDepth(root.left);
	        int rightHeight = maxDepth(root.right);
	        
	        int myHeight = Math.max(leftHeight, rightHeight)+1;
	        return myHeight;
	    }

	public static void main(String[] args) {
		int[] nodes = new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1, };
		Binary_Tree tree = new Binary_Tree();
		Node root = tree.buildTree(nodes);
		System.out.println(maxDepth(root));
	}
}
