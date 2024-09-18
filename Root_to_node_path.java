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


public class Root_to_node_path {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.left.right.left = new TreeNode(6);
        root1.left.right.right = new TreeNode(7);

        ArrayList<Integer> arr= new ArrayList<>();
        if(root1==null){ //if passed root is null
            System.out.println(arr);
            return;
        }
        findPath(root1, 7, arr);
        System.out.println(arr);
    }

    public static boolean findPath(TreeNode q, int target, ArrayList<Integer> arr){
        if (q==null) return false; //if you went to right or left of a leaf node
        arr.add(q.val);
        if (q.val==target) return true; //if you found the desired node
        if (findPath(q.left,target,arr) || findPath(q.right,target,arr)) return true; // whether the target is present in right or left subtree of the passed node
        arr.remove(arr.size()-1); //remove element added
        return false;
    }
}

//Output :

// [1, 2, 5, 7]

//time complexity : O(N)
//space complexity : O(H), H->height of tree
