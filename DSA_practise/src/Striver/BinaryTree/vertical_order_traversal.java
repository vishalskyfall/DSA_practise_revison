package Striver.BinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class vertical_order_traversal {

	class Node implements Comparable<Node> {
		public int x;
		public int y;
		public int val;
		public Node left;
		public Node right;

		public Node(int x, int y, int val) {
			this.x = x;
			this.y = y;
			this.val = val;
		}

		@Override
		public int compareTo(Node o) {
			int xDiff = this.x - o.x;
			if (xDiff != 0)
				return xDiff;
			int yDiff = this.y - o.y;
			if (yDiff != 0)
				return yDiff;
			return this.val - o.val;
		}
	}

	public List<List<Integer>> verticalTraversal(Node root) {
		List<List<Integer>> result = new ArrayList<>();
		PriorityQueue<Node> q = new PriorityQueue<>();
		this.process(q, root, 0, 0);
		
	  Map<Integer, List<Integer>> map = new HashMap<>();
    
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    while (!q.isEmpty()) {
      Node node = q.poll();
      
      min = Math.min(min, node.x);
      max = Math.max(max, node.x);
      
      List<Integer> vertical = map.getOrDefault(node.x, new ArrayList<>());
      vertical.add(node.val);
      map.put(node.x, vertical);
  }
  
  for (int v = min; v <= max; v++) {
      List<Integer> vertical = map.get(v);
      result.add(vertical);
  }
  
		
		return result;
	}
	 private void process(PriorityQueue<Node> queue, Node root, int x, int y) {
     if (root == null)
         return;
     
     Node node = new Node(x, y, root.val);
     queue.add(node);
     
     this.process(queue, root.left, x - 1, y + 1);
     this.process(queue, root.right, x + 1, y + 1);
 }
}
