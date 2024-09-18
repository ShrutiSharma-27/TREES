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

public class BST_Search {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(8);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(12);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(7);
        root1.left.right.left = new TreeNode(6);
        root1.right.left = new TreeNode(10);
        root1.right.right = new TreeNode(14);
        root1.right.right.left = new TreeNode(13);

        TreeNode result_node = search(root1, 7);
        System.out.println(result_node.val);
    }

    public static TreeNode search(TreeNode q, int target){
        while(q != null && q.val != target){
            q = target < q.val ? q.left : q.right;
        }
        return q;
    }
}

//Output :

// 7

//time complexity = O(H) = O(logN)
//space complexity = O(N)
