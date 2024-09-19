//Floor : Biggest possible value which is <= given key.

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


public class BST_floor {
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

        int ceil = getFloor(root1, 8);
        System.out.println(ceil);
    }

    public static int getFloor(TreeNode q, int key){
        int floor =-1;
        while(q != null){
            if(q.val==key){
                floor=q.val;
                return floor;
            }
            if(q.val<key){ //found smaller value
                floor=q.val;
                q=q.right; //checking for bigger possible value which is less than equal to the given key
            }
            else{
                q=q.left;
            }
        }
        return floor;
    }
}

// Output : 

// 6

//time complexity : O(logN)
