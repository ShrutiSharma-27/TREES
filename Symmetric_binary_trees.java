// Symmetric Binary Tree : Mirror Image of itself

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


public class Symmetric_binary_trees {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(4);
        root1.right.left = new TreeNode(4);
        root1.right.right = new TreeNode(3);

        System.out.println(root1==null || isSymmetric(root1.left, root1.right));
    }

    public static boolean isSymmetric(TreeNode left, TreeNode right){
        if(left==null || right==null) return left==right;
        if(left.val != right.val) return false;
        return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
    }
}

//Output :

// true

//time complexity : O(N)
//space complexity : O(N)
