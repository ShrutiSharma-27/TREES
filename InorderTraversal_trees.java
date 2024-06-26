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

    //function to print inorder traversal
    void printInorder(Node node){
        if (node==null) return;

        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
}

public class InorderTraversal_trees {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.printInorder(tree.root);
    }
}

//Output :

// 4 2 5 1 6 3 7 
