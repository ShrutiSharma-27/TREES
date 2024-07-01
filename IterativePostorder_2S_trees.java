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

    void printPostorder_2S(Node node){
        if (node==null) System.out.println("Tree root is null");
        else{
            Stack<Node> stack1 = new Stack<>();
            Stack<Node> stack2 = new Stack<>();
            
            stack1.push(node);

            while(!stack1.isEmpty()){
                node=stack1.pop();
                stack2.push(node);
                if (node.left != null) stack1.push(node.left);
                if (node.right != null) stack1.push(node.right);
            }
            
            while(!stack2.isEmpty()){
                node=stack2.pop();
                System.out.print(node.data+" ");
            }
        }
    }
}

public class IterativePostorder_2S_trees {
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

        tree.printPostorder_2S(tree.root);
    }
}

//Output :

// 12 30 40 37 25 60 70 62 57 75 50
