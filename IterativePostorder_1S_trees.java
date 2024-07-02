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

    void printPostorder(Node node){
        if (node==null) System.out.println("Tree root is null");
        else{
            Stack<Node> stack = new Stack<>();
            
            Node curNode = node;

            while(!stack.isEmpty() || curNode != null){
                if(curNode != null){
                    stack.push(curNode);
                    curNode=curNode.left;
                }
                else{
                    Node tempNode=stack.peek().right;
                    if (tempNode==null){
                        tempNode=stack.pop();
                        System.out.print(tempNode.data+" ");
                        while(!stack.isEmpty() && tempNode==stack.peek().right){
                            tempNode=stack.pop();
                            System.out.print(tempNode.data+" ");
                        }
                    }
                    else{
                        curNode=tempNode;
                    }
                }
            }
        }
    }
}

public class IterativePostorder_1S_trees {
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

        tree.printPostorder(tree.root);
    }
}

//Output :

// 12 30 40 37 25 60 70 62 57 75 50

//time complexity : O(2N)
//space complexity : O(N)
