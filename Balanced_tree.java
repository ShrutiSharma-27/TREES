//Balanced Tree : for every node abs(left height - right height) <= 1

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


public class Balanced_tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(5);

        int treeHeight = isBalanced(root);
        System.out.println(treeHeight != -1);
    }

    public static int isBalanced(TreeNode root){
        if(root==null) return 0;
        int lh = isBalanced(root.left); //taking left height
        if (lh==-1) return -1; //if at any level we received -1 then it means tree is unbalanced.
        int rh = isBalanced(root.right); //taking right height
        if (rh==-1) return -1;

        if(Math.abs(lh-rh)>1) return -1; //checking if balanced or not balanced

        return 1 + Math.max(lh, rh); // returning max height to lh and rh variable
    }
}

//Output :

//false

//time complexity : O(N)
//space complexity : O(N)
