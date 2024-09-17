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
        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(-30);
        root.right.right = new TreeNode(-15);

        int[] maxSum = new int[1];

        int call_function = getMaxSum(root,maxSum);
        System.out.println(maxSum[0]);
    }

    public static int getMaxSum(TreeNode root, int[] maxi){
        if(root==null) return 0;
        int lh = Math.max(0,getMaxSum(root.left, maxi)); //taking max sum from left
        int rh = Math.max(0,getMaxSum(root.right, maxi)); //taking max sum from right

        maxi[0] = Math.max(maxi[0],lh+rh+root.val);

        return root.val + Math.max(lh,rh);
    }
}

// Output :

// 45

//time complexity : O(N)
//space complexity : O(N)
