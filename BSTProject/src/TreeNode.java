public class TreeNode
{
	private TreeNode left;
	private TreeNode right;
	private Comparable value;
	
	public TreeNode(Comparable initValue)
	{
		value = initValue;
		left = null;
		right = null;
	}//end constructor

	public TreeNode(Comparable initValue, TreeNode initLeft, TreeNode initRight)
	{
		value = initValue;
		left = initLeft;
		right = initRight;
	}//end constructor
	
	public Comparable getValue()
	{
		return value;
	}//end getValue

	public TreeNode getLeft()
	{
		return left;
	}//end getLeft

	public TreeNode getRight()
	{
		return right;
	}//end getRight
	
	public void setValue(Comparable newValue)
	{
		value = newValue;
	}//end setValue

	public void setLeft(TreeNode newLeft)
	{
		left = newLeft;
	}//end setLeft
	
	public void setRight(TreeNode newRight)
	{
		right = newRight;
	}//end setRight
}//end TreeNode