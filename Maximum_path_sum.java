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


public class Maximum_path_sum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(-5);
        root.left.right.left = new TreeNode(-6);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(8);
        root.right.right.right = new TreeNode(9);
        root.right.right.right.left = new TreeNode(-10);
        root.right.right.right.right = new TreeNode(11);
        root.right.right.right.left.right = new TreeNode(12);

        int[] maxSum = new int[1];

        int call_function = getMaxSum(root,maxSum);
        System.out.println(maxSum[0]);
    }

    public static int getMaxSum(TreeNode root, int[] maxi){
        if(root==null) return 0;
        int lh = getMaxSum(root.left, maxi); //taking left height
        int rh = getMaxSum(root.right, maxi); //taking right height

        maxi[0] = Math.max(maxi[0],lh+rh+root.val);

        return root.val + Math.max(lh,rh); // returning max height to lh and rh variable
    }
}

// Output :

// 38

//time complexity : O(N)
//space complexity : O(N)
