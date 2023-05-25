class Node {
    int data;
    Node left, right;
    
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;
    
    public BinarySearchTree() {
        root = null;
    }
    
    public void insert(int data) {
        root = insertNode(root, data);
    }
    
    private Node insertNode(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        
        if (data < root.data) {
            root.left = insertNode(root.left, data);
        } else if (data > root.data) {
            root.right = insertNode(root.right, data);
        }
        
        return root;
    }
    
    public void printLeafNodes() {
        System.out.print("Leaf Nodes: ");
        printLeafNodes(root);
        System.out.println();
    }
    
    private void printLeafNodes(Node root) {
        if (root == null) {
            return;
        }
        
        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }
        
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }
}

public class p34 {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(3);
        bst.insert(10);
        bst.insert(1);
        bst.insert(6);
        bst.insert(14);
        bst.insert(4);
        bst.insert(7);
        bst.insert(13);
        
        bst.printLeafNodes();
    }
}
