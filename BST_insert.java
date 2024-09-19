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


public class BST_insert {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(4);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(1);
        root1.left.right = new TreeNode(3);

        TreeNode modified_tree = insert(root1, 8);
    }

    public static TreeNode insert(TreeNode root, int val){
        if (root==null) return new TreeNode(val);
        TreeNode cur = root;
        while(true){
            if(cur.val < val){
                if(cur.right != null) cur=cur.right;
                else{
                    cur.right=new TreeNode(val);
                    break;
                }
            }
            else{
                if(cur.left != null) cur=cur.left;
                else{
                    cur.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}

//time complexity : O(logN)
