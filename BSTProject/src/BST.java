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
    }//end constructor

    public void add(Comparable obj)
    {
        root = addHelper(root, obj);
    }//end add

    private TreeNode addHelper(TreeNode subroot, Comparable obj)
    {
        if (subroot == null)
        {
            return new TreeNode(obj);
        }//end if
        Comparable temp = subroot.getValue();
        if (temp.compareTo(obj) >= 0)
        {
            subroot.setLeft(addHelper(subroot.getLeft(), obj));
        }//end if
        else
        {
            subroot.setRight(addHelper(subroot.getRight(), obj));
        }//end else
        return subroot;
    }//end addHelper

	public boolean find(Comparable obj)
	{
		TreeNode currentNode = root;

		while(currentNode != null)
		{

			if(currentNode.getValue().compareTo(obj) == 0)
			{
				return true;
			}// end if

			else if(currentNode.getValue().compareTo(obj) > 0)
			{
				currentNode = currentNode.getLeft();
			}//end else if

			else if(currentNode.getValue().compareTo(obj) < 0)
			{
				currentNode = currentNode.getRight();
			}// end else if
		}// end while
		return false;
	}//end find

    public boolean delete(Object old)
    {
        TreeNode currentNode = root;
	    TreeNode parent = null;
	    TreeNode objToDelete = null;

        while (currentNode != null && objToDelete  == null)
        {
            int cmp = currentNode.getValue().compareTo(old);

            if(cmp == 0)
            {
                objToDelete = currentNode;
            }//end if

            else if (cmp > 0)
            {
                parent = currentNode;
                currentNode = currentNode.getLeft();
            }//end else if

            else if(cmp < 0)
            {
                parent = currentNode;
                currentNode = currentNode.getRight();
            }//end else if
        }//end while

        if (objToDelete == null)
        {
            return false;
        }//end if

        if(root == objToDelete)
        {
            rootDeleteHelper(root);
            return true;
        }//end if

        else
        {
            deleteHelper(objToDelete, parent);
            return true;
        }//end else
    }//end delete

    private void rootDeleteHelper(TreeNode subroot)
    {
        TreeNode objToDeleteLC = subroot.getLeft();
        TreeNode objToDeleteRC = subroot.getRight();
        
        if(objToDeleteLC != null && objToDeleteRC != null)
        {
            TreeNode tracker = objToDeleteLC;
            while(tracker.getRight() != null)
            {
                tracker = tracker.getRight();
            }
            tracker.setRight(objToDeleteRC);
            root = objToDeleteLC;
        }//end if

        else if (objToDeleteLC == null && objToDeleteRC == null)
        {
			root = null;
        }//end else if

        else if (objToDeleteLC != null && objToDeleteRC == null)
        {
            root = objToDeleteLC;
        }//end else if
        else if (objToDeleteLC == null && objToDeleteRC != null)
        {
            root = objToDeleteRC;
        }//end else
    }//end rootDeleteHelper

    private void deleteHelper(TreeNode objToDelete, TreeNode parent)
    {
        TreeNode objToDeleteLC = objToDelete.getLeft();
        TreeNode objToDeleteRC = objToDelete.getRight();

        if(objToDeleteLC == null && objToDeleteRC == null)
        {
            if(objToDelete == parent.getLeft())
            {
                parent.setLeft(null);
                return;
            }//end if
            else
            {
                parent.setRight(null);
                return;
            }//end else
        }//end if

        else if (objToDeleteLC != null && objToDeleteRC != null)
        {
            if(objToDelete == parent.getLeft())
            {
                parent.setLeft(objToDeleteLC);
                TreeNode tracker = objToDeleteLC;
                while(tracker.getRight() != null)
                {
                    tracker = tracker.getRight();
                }//end while
                tracker.setRight(objToDeleteRC);
                return;
            }//end if
            else
            {
                parent.setRight(objToDeleteLC);
                TreeNode tracker = objToDeleteLC;
                while(tracker.getRight() != null)
                {
                    tracker = tracker.getRight();
                }//end while
                tracker.setRight(objToDeleteRC);
                return;
            }//end else
        }//end if
        
        else
        {
            if(objToDeleteLC != null)
            {
                if(parent.getLeft() == objToDelete)
                {
                    parent.setLeft(objToDeleteLC);
                    return;
                }//end if
                else
                {
                    parent.setRight(objToDeleteLC);
                    return;
                }//end else
            }//end if
            else
            {
                if(parent.getLeft() == objToDelete)
                {
                    parent.setLeft(objToDeleteRC);
                    return;
                }//end if
                else
                {
                    parent.setRight(objToDeleteRC);
                    return;
                }//end else
            }//end else
        }//end else
    }//end deleteHelper





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