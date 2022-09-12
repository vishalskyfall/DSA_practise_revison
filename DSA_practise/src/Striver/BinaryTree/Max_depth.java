package Striver.BinaryTree;

import java.util.Stack;

public class Max_depth {
	public static void main(String[] args) {
		Node root = new Node(3);
		root.left = new Node(9);
		root.right = new Node(20);
		root.left.left = new Node(15);
		root.left.right = new Node(7);
		System.out.println(max_depth(root));
		System.out.println("recursion : "+max_depth_2(root));
	}

	private static int max_depth(Node root) { // not recommended 
		if (root == null)
			return 0;
//			System.out.println("null");
		int c = 0;
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		while (1 == 1) {
			int nodeCount = s.size();
			if (nodeCount == 0)
				return c;
//				System.out.println(c + " inside");
			c++;
			while (nodeCount > 0) {
				Node n = s.peek();
				s.pop();
				if (n.left != null)
					s.push(n.left);
				if (n.right != null)
					s.push(n.right);
				nodeCount--;
			}
		}

	}
	
	static int max_depth_2(Node root)
	{
		if(root == null)
			return 0;
		
		int left = max_depth(root.left);
		int right = max_depth(root.right);
		
		int depth = Math.max(left, right)+1; //1 is root
		return depth;
	}
}
