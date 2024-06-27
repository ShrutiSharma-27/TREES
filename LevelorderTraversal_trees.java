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

    void printLevelOrder(Node node){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node); //adding root

        while(!queue.isEmpty()){
            int count=queue.size();
            for(int i=0 ; i<count ; i++){
                // The remove() and poll() methods differ only in their behavior when the queue is empty:
                // the remove() method throws an exception, while the poll() method returns null
                Node tempNode = queue.poll(); //delete the first/front in queue
                System.out.print(tempNode.data+" ");

                if (tempNode.left != null) queue.add(tempNode.left);

                if (tempNode.right != null) queue.add(tempNode.right);  
            }
            System.out.println();
        }
    }
}

public class LevelorderTraversal_trees {
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
        
        tree.printLevelOrder(tree.root);
    }
}

//Output :

// 50 
// 25 75 
// 12 37 62 57 
// 30 40 60 70 

//time complexity = O(N), as you are traversing each node
//space complexity = O(N)
