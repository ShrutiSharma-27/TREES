class Node{
    int data;
    Node right;
    Node left;

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

    //function to print postorder traversal
    void printPostorder(Node node){
        if (node==null) return;
        
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data+" ");
    }
}

public class PostorderTraversal_Trees {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        
        tree.printPostorder(tree.root);
    }
}

//Output :

// 4 5 2 6 7 3 1 
