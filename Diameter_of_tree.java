// Diameter/width of a tree is defined as the number of nodes on the longest path between any two nodes. Not necessarily passing though root.

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


public class Diameter_of_tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(5);

        int[] diameter = new int[1];

        int height = getHeight(root,diameter);
        System.out.println(diameter[0]);
    }

    public static int getHeight(TreeNode root, int[] maxi){
        if(root==null) return 0;
        int lh = getHeight(root.left, maxi); //taking left height
        int rh = getHeight(root.right, maxi); //taking right height

        maxi[0] = Math.max(maxi[0],lh+rh+1);

        return 1 + Math.max(lh,rh); // returning max height to lh and rh variable
    }
}

// Output :

// 5

//Time complexity : O(N)
//Space complexity : O(N)
