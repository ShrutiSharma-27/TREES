// Ceil : smallest possible node value which is >= given key

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


public class BST_ceil {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(13);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(6);
        root1.left.left.left = new TreeNode(2);
        root1.left.left.right = new TreeNode(4);
        root1.left.right.right = new TreeNode(9);
        root1.right.left = new TreeNode(11);
        root1.right.right = new TreeNode(14);

        int ceil = getCeil(root1, 8);
        System.out.println(ceil);
    }

    public static int getCeil(TreeNode q, int key){
        int ceil=-1;
        while(q != null){
            if(q.val==key){
                ceil=q.val;
                return q.val;
            }
            if(q.val<key) q=q.right;
            else{
                ceil=q.val; // found a greater value
                q=q.left; //but will search for more small ceil possible
            }
        }
        return ceil;
    }
}

// Output :

// 9

//time compexity : O(logN)
