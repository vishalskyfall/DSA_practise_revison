package Binary_Tree;

public class Count_sum_nodes {
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

	public static int SumOfNodes(Node root) {
		if(root==null)
			return 0;
		int lefSum=SumOfNodes(root.left);
		int rigSum= SumOfNodes(root.right);
		return lefSum+rigSum+root.data;
	}
	public static int countOfNodes(Node root) {
		if(root==null)
			return 0;
		int lef=countOfNodes(root.left);
		int rig= countOfNodes(root.right);
		return lef+rig+1;
	}
	public static void main(String[] args) {
		int[] nodes = new int[] { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1, };
		Binary_Tree tree = new Binary_Tree();
		Node root = tree.buildTree(nodes);
		System.out.println(countOfNodes(root)+" "+SumOfNodes(root));
	}
}
