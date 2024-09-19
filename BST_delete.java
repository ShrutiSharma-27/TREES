import com.sun.source.tree.Tree;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val, TreeNode right, TreeNode left){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}


public class BST_delete {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);

        TreeNode modified_tree = delete(root1, 7);
    }

    public static TreeNode delete(TreeNode root, int key){
        if(root==null) return null;
        if(root.val==key) return helper(root);
        TreeNode dummy = root; //to save root for returning
        while(root != null){
            if(root.val>key){
                if(root.left!=null && root.left.val==key){
                    root.left=helper(root.left);
                    break;
                }
                else root=root.left;
            }
            else{
                if(root.right != null && root.right.val==key){
                    root.right=helper(root.right);
                    break;
                }
                else root=root.right;
            }
        }
        return dummy;
    }

    public static TreeNode helper(TreeNode root){
        if(root.left==null) return root.right;
        else if(root.right==null) return root.left;
        else{
            TreeNode rightChild = root.right; //taken the right child of the node to be deleted
            TreeNode lastRight = findLastRight(root.left); //to get the last right node in the left subtree so that I can attach rightChild to it
            lastRight.right = rightChild; //attaching
            return root.left;
        }
    }

    public static TreeNode findLastRight(TreeNode root){
        if(root.right == null) return root;
        return findLastRight(root.right);
    }
}
