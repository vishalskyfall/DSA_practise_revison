package Striver.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
class Pair2{
    int num;
    Node node;
    Pair2(int num, Node node){
        this.num= num;
        this.node=node;
    }
}
class Solution {
    public int widthOfBinaryTree(Node root) {
        
        if(root ==  null)
            return 0;
        int ans=0;
        Queue<Pair2> q = new LinkedList<>();
        q.add(new Pair2(0, root));
        while(!q.isEmpty()){
            int size = q.size();
            int min = q.peek().num;
            int first =0; int last =0;
            for(int i=0;i<size;i++){
                int curr_id = q.peek().num-min;
                Node node = q.peek().node;
                q.poll();
                
                if(i==0){
                    first = curr_id;
                }
                if(i==size-1){
                    last = curr_id;
                }
                if(node.left!=null)
                    q.add(new Pair2(curr_id*2+1,node.left) );
                
                if(node.right!=null)
                    q.add(new Pair2(curr_id*2+2,node.right ) );
            }
             ans=Math.max(ans, last-first+1);
        }
        return ans;
    }
}