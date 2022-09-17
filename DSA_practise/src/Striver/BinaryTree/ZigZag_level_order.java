package Striver.BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag_level_order {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
	}
	 public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
     List<List<Integer>> ans = new ArrayList<List<Integer>>();
     if(root == null){
       return ans;
   }
   Queue<TreeNode> q = new LinkedList<>();
   int j = 0;
   q.offer(root);
   while(!q.isEmpty()){
       int size = q.size();
       ArrayList<Integer> al = new ArrayList<>();
       for(int i = 0 ; i < size; i ++){
           TreeNode node = q.poll();
           al.add(node.val);
           if(node.left != null){
               q.offer(node.left);
           }
           if(node.right != null){
               q.offer(node.right);
           }
       }
       if(j%2 == 1){
           Collections.reverse(al);
       }
       ans.add(new ArrayList<>(al));
       j++;
   }
   return ans;
   }
}
