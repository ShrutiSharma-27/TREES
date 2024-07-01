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

    void printInOrder(Node node){
        if (node==null) System.out.println("Tree root is null");
        else{
            Stack<Node> stack = new Stack<>();

            while(true){
                if (node != null){
                    stack.push(node);
                    node=node.left;
                }
                else{
                    if(stack.isEmpty()) break;
                    node=stack.pop();
                    System.out.print(node.data+" "); //basically it is the root when left node was null and also one of the left node present in the left subtree.
                    node=node.right; //and now going to right node
                }
            }
        }
    }
}

public class IterativeInorder_trees {
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

        tree.printInOrder(tree.root);
    }
}

//Output :

// 12 25 30 37 40 50 60 62 70 75 57

//time complexity : O(N)
//time complexity : O(N)
