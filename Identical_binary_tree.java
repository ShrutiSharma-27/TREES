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


public class Identical_binary_tree {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(15);
        root1.left = new TreeNode(10);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(-30);
        root1.right.right = new TreeNode(-15);

        TreeNode root2 = new TreeNode(15);
        root2.left = new TreeNode(10);
        root2.right = new TreeNode(20);
        root2.right.left = new TreeNode(-30);
        root2.right.right = new TreeNode(-15);

        System.out.println(areIdentical(root1,root2));
    }

    public static boolean areIdentical(TreeNode p, TreeNode q){
      if(p==null || q==null){
          return p==q;
      }
      return (p.val==q.val) && areIdentical(p.left, q.left) && areIdentical(p.right, q.right);
    }
}

// Output :

// true

// time complexity : O(N)
// space complexity : O(N)  
