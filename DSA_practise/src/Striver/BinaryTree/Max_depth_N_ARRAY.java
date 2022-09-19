package Striver.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node1 {
	public int val;
	public List<Node1> children;

	public Node1() {
	}

	public Node1(int _val) {
		val = _val;
	}

	public Node1(int _val, List<Node1> _children) {
		val = _val;
		children = _children;
	}
};

class Max_depth_N_ARRAY {
	private int max_depth;

	public int maxDepth(Node1 root) {
		if (root == null)
			return 0;

//       int depth =0;

//       Queue<Node> q = new LinkedList<>();
//       q.offer(root);

//       while(!q.isEmpty()){
//           int size = q.size();
//           for(int i=0;i<size;i++){
//              Node n = q.poll();
//               for(Node child : n.children){
//                   q.offer(child);
//               }
//           }

//           depth++;
//       }
//       return depth; //bfs

		max(root, 1);
		return max_depth; // dfs
	}

	void max(Node1 root, int depth) {
		if (root == null)
			return;
		max_depth = Math.max(depth, max_depth);
		for (Node1 child : root.children) {
			max(child, depth + 1);
		}
	}
}