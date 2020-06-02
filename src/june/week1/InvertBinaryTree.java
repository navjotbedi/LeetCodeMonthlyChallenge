/**
	Invert a binary tree.
	
	Example:
	
	Input:
	
	     4
	   /   \
	  2     7
	 / \   / \
	1   3 6   9
	
	Output:
	
	     4
	   /   \
	  7     2
	 / \   / \
	9   6 3   1
 */

package june.week1;

import utils.TreeNode;

public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
		invertTreeRec(root);
		return root;
	}

	public void invertTreeRec(TreeNode root) {
		if (root == null) {
			return;
		}

		TreeNode tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;

		invertTreeRec(root.left);
		invertTreeRec(root.right);
	}

}
