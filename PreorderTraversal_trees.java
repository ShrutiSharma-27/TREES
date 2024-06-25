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

    //function to print preorder traversal
    void printPreorder(Node node){
        if (node==null) return;

        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
}

public class PreorderTraversal_trees {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        tree.printPreorder(tree.root);
    }
}

//Output:

//1 2 4 5 3 6 7 
