package Binary_Tree;

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
		if (root == null)
			return 0;
		int leftHeight = maxDepth(root.left);
		int rightHeight = maxDepth(root.right);

		int myHeight = Math.max(leftHeight, rightHeight) + 1;
		return myHeight;
	}

	public static int diameter(Node root) {
		if (root == null)
			return 0; // on^2

		int diam1 = diameter(root.left);
		int diam2 = diameter(root.right);
		int diam3 = maxDepth(root.left) + maxDepth(root.right) + 1;

		return Math.max(diam3, Math.max(diam1, diam2));
	}

	public static TreeInfo diameter_2(Node root) {
		// o(n)
		if (root == null)
			return new TreeInfo(0, 0);

		TreeInfo left = diameter_2(root.left);
		TreeInfo right = diameter_2(root.right);

		int myHeight = Math.max(left.height, right.height) + 1;

		int diam1 = left.diameter;
		int diam2 = right.diameter;
		int diam3 = left.height + right.height + 1;

		int myDiameter = Math.max(Math.max(diam1, diam2), diam3);

		TreeInfo myInfo = new TreeInfo(myHeight, myDiameter);
		return myInfo;
	}

	public static class TreeInfo {
		int height;
		int diameter;

		TreeInfo(int height, int diameter) {
			this.height = height;
			this.diameter = diameter;
		}
	}

	public static void main(String[] args) {
		int[] nodes = new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1, };
		Binary_Tree tree = new Binary_Tree();
		Node root = tree.buildTree(nodes);
		System.out.println(maxDepth(root));
		System.out.println(diameter(root));
		System.out.println(diameter_2(root).diameter);
	}
}
