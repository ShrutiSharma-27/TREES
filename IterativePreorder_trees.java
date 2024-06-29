import java.util.*;
        
class Node{
    int data;
    Node left;
    Node right;

    Node(int key){
        data=key;
        left=null;
        right=null;
    }
}

class BinaryTree{
    Node root;

    BinaryTree(){
        root=null;
    }

    void printPreOrder(Node node){
        if (node==null) System.out.println("Tree root is null");
        else{
            Stack<Node> stack = new Stack<>();
            stack.push(node); //push root

            while(!stack.isEmpty()){
                Node tempNode = stack.pop(); //delete the top in tree
                System.out.print(tempNode.data+" "); //first root gets printed

                if (tempNode.right != null) stack.push(tempNode.right); //push right
                if (tempNode.left != null) stack.push(tempNode.left); //push left at last so that it comes out before right
            }
        }
    }
}

public class IterativePreorder_trees {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(50);
        tree.root.left = new Node(25);
        tree.root.right = new Node(75);
        tree.root.left.left = new Node (12);
        tree.root.left.right = new Node(37);
        tree.root.right.left = new Node(62);
        tree.root.right.right = new Node(57);
        tree.root.left.right.left = new Node(30);
        tree.root.left.right.right = new Node(40);
        tree.root.right.left.left = new Node(60);
        tree.root.right.left.right = new Node(70);

        tree.printPreOrder(tree.root);
    }
}

//Output :

// 50 25 12 37 30 40 75 62 60 70 57

//time complexity : O(N)
//space complexity : O(N)
