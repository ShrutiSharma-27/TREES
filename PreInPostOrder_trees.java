import java.util.*;
//import javafx.util.Pair; commented because no compiler which I used can recognise javafx

class Pair{ //so made my own class of Pair customised for this program
    Node nd;
    int num;
    
    Pair(Node first, int second){
        this.nd=first;
        this.num=second;
    }
}
        
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

    void printPreInPostOrder(Node node){
        if (node==null) System.out.println("Tree root is null");
        else{
            Stack<Pair> stack = new Stack<>();
            stack.push(new Pair(node,1));
            List<Integer> pre = new ArrayList<>();
            List<Integer> in = new ArrayList<>();
            List<Integer> post = new ArrayList<>();
            
            while (!stack.isEmpty()){
                Pair topPair = stack.pop();
                
                if (topPair.num==1){
                    pre.add(topPair.nd.data);
                    topPair.num++;
                    stack.push(topPair);
                    
                    if(topPair.nd.left != null){
                        stack.push(new Pair(topPair.nd.left, 1));
                    }
                }
                
                else if (topPair.num==2){
                    in.add(topPair.nd.data);
                    topPair.num++;
                    stack.push(topPair);
                    
                    if(topPair.nd.right != null){
                        stack.push(new Pair(topPair.nd.right, 1));
                    }
                }
                
                else{
                    post.add(topPair.nd.data); 
                }
            }
            System.out.println("Preorder : "+pre);
            System.out.println("Inorder : "+in);
            System.out.println("Postorder : "+post);
        }
        
    }
}

public class PreInPostOrder_trees {
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

        tree.printPreInPostOrder(tree.root);
    }
}

//Output :

// Preorder : [50, 25, 12, 37, 30, 40, 75, 62, 60, 70, 57]
// Inorder : [12, 25, 30, 37, 40, 50, 60, 62, 70, 75, 57]
// Postorder : [12, 30, 40, 37, 25, 60, 70, 62, 57, 75, 50]

// time complexity : O(N)
// space complexity : O(4N), because 3 Lists + 1 Stack
