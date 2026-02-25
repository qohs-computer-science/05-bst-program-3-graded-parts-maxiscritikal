/*
 * Max Korsa 
 * 2/25/26
 * PD: 6
 * Creates a BST, with methods for everything you need, that is super epic.
 */
import java.lang.Comparable;
public class BST implements BSTInterface
{
    private TreeNode root;

	public BST()
	{
		root = null;
	}

    public void add(Object obj)
    {
        if(root == null)
		{
			root = new TreeNode(obj);
		}

		else if(root.getValue().compareTo(obj) >= 0)
		{
			if(root.getLeft() != null)
			{
				obj = root.getLeft();
			}
			else
			{
				root.setLeft(new TreeNode(obj));
			}
		}

		else if(root.getValue().compareTo(obj) < 0)
		{
			if(root.getRight() != null)
			{
				obj = root.getRight();
			}
			else
			{
				root.setRight(new TreeNode(obj));
			}
		}
    }
}