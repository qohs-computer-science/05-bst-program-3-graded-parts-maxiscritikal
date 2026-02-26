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

    public void add(Comparable obj)
    {
        root = addHelper(root, obj);
    }

    private TreeNode addHelper(TreeNode subroot, Comparable obj)
    {
        if (subroot == null)
        {
            return new TreeNode(obj);
        }
        Comparable temp = subroot.getValue();
        if (temp.compareTo(obj) >= 0)
        {
            subroot.setLeft(addHelper(subroot.getLeft(), obj));
        }
        else
        {
            subroot.setRight(addHelper(subroot.getRight(), obj));
        }
        return subroot;
    }

	public boolean find(Comparable obj)
	{
		TreeNode currentNode = root;

		while(currentNode != null)
		{

			if(currentNode.getValue().compareTo(obj) == 0)
			{
				return true;
			}

			else if(currentNode.getValue().compareTo(obj) > 0)
			{
				currentNode = currentNode.getLeft();
			}

			else if(currentNode.getValue().compareTo(obj) < 0)
			{
				currentNode = currentNode.getRight();
			}
		}
		return false;
	}


	//all print methods are below 

    public void printInOrder()
    {
        inOrderHelper(root);
    }//end inOrder

    private void inOrderHelper(TreeNode subroot)
    {
        if (subroot != null)
        {
            inOrderHelper(subroot.getLeft());
            System.out.println(subroot.getValue());
            inOrderHelper(subroot.getRight());
        }//end if
    }//end inOrderHelper

	public void printPreOrder()
    {
        preOrderHelper(root);
    }//end PreOrder

	private void preOrderHelper(TreeNode subroot)
    {
        if (subroot != null)
        {
			System.out.println(subroot.getValue());
            preOrderHelper(subroot.getLeft());
            preOrderHelper(subroot.getRight());
        }//end if
    }//end PreOrderHelper

	public void printPostOrder()
    {
        postOrderHelper(root);
    }//end PostOrder

	private void postOrderHelper(TreeNode subroot)
    {
        if (subroot != null)
        {
            postOrderHelper(subroot.getLeft());
            postOrderHelper(subroot.getRight());
			System.out.println(subroot.getValue());
        }//end if
    }//end postOrderHelper
}//end BST