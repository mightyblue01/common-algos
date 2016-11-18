
public class TreeNode {
	
	public int data;
	TreeNode leftTree;
	TreeNode rightTree;
	
	public TreeNode(int data)
	{
		this.data = data;
		this.leftTree = null;
		this.rightTree = null;
	}
		
	
	public void addNode(TreeNode root, int data)
	{
		if (root == null)
		{
			root = new TreeNode(data);
		}
		else if(data<root.data){
			if(root.leftTree==null){
				root.leftTree= new TreeNode(data);
			}
			else{
				addNode(root.leftTree,data);
			}
		}
		else{
			if(root.rightTree==null){
				root.rightTree=new TreeNode(data);
			}
			else{
				addNode(root.rightTree,data);
			}
		}
  }
	
  public void printTree(TreeNode root)
  {
	  if(root==null)
		  return;
	  printTree(root.leftTree);
	  System.out.println(" "+root.data);
	  printTree(root.rightTree);
	 
  }
  
  
  
  
  
}