/* November 16, 2016 :: 2
 * 
 * <Binary Tree Level Order Traversal>  
 * 
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

	For example:
	Given binary tree [3,9,20,null,null,15,7],
	    3
	   / \
	  9  20
	    /  \
	   15   7
	return its level order traversal as:
	[
	  [3],
	  [9,20],
	  [15,7]
	]
 * */


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	public static List<List<Integer>> levelOrder(TreeNode root){
	
		 List<List<Integer>> al = new ArrayList<>();
	      if(root==null)
	        return al;
	      Queue<TreeNode> q = new LinkedList<TreeNode>();
	      q.offer(root);
	      q.offer(null);
	      
	      ArrayList<Integer> curr = new ArrayList<Integer>();
	      while(!q.isEmpty()){
	          TreeNode temp = q.poll();
	          if(temp!=null){
	              curr.add(temp.data);
	              if(temp.leftTree!=null)
	                q.offer(temp.leftTree);
	              if(temp.rightTree!=null)
	                q.offer(temp.rightTree);
	          }
	          else{
	              ArrayList<Integer> vol = new ArrayList<Integer>(curr);
	              al.add(vol);
	              curr.clear();
	              if(!q.isEmpty())
	                q.offer(null);
	          }
	      }
	      return al;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(12);
		root.addNode(root, 10);
		root.addNode(root, 16);
		root.addNode(root, 9);
		root.addNode(root, 11);
		root.addNode(root, 13);
		root.addNode(root, 17);
		
		List<List<Integer>> al = levelOrder(root);
		for(List<Integer> temp: al){
			System.out.println("[");
			for(int i : temp){
				System.out.println(" ,"+i);
			}
			System.out.println("]");
				
		}
	}

}
