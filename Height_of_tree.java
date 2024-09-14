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


public class Height_of_tree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(5);

        int treeHeight = findHeight(root);
        System.out.println(treeHeight);
    }

    public static int findHeight(TreeNode root){
        if(root==null) return 0;
        int lh = findHeight(root.left); //calculate left height
        int rh = findHeight(root.right); //calculate left height

        return 1 + Math.max(lh, rh);
    }
}

// Output :

// 3

//Time Complexity = O(N)
//Space Complexity = O(N)
