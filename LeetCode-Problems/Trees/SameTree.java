/* November 16, 2016 :: 1
 * 
 * <Same Tree>  
 * 
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 * */


public class SameTree {

	  public static boolean isSameTree(TreeNode p, TreeNode q) {
	        //Return condition
	        if(p==null && q==null)
	          return true;
	        else if(p==null || q==null)
	          return false;
	        
	        //If nodes are not equal
	        if(p.data!=q.data)
	          return false;
	        
	        if(isSameTree(p.leftTree,q.leftTree) && isSameTree(p.rightTree,q.rightTree))
	          return true;
	        else
	          return false;
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeNode root = new TreeNode(1);
		root.addNode(root, 2);
		root.addNode(root, 3);
		root.addNode(root, 4);
		/*root.addNode(root, 11);
		root.addNode(root, 13);
		root.addNode(root, 17);*/
		
		TreeNode root1 = new TreeNode(1);
		root1.addNode(root, 2);
		root1.addNode(root, 3);
		root1.addNode(root, 4);
		/*root1.addNode(root, 11);
		root1.addNode(root, 13);
		root1.addNode(root, 17);*/
		
		System.out.println(isSameTree(root,root1));
		
	}

}
