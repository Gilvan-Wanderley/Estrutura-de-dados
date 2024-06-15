package dataStructure;

public class BST {
    public class Node {
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }

        public boolean isLeaf() {
            return (left == null) && (right == null);
        }
    }

    public Node root;

    public BST(int data) {
        root = new Node(data);
    }

    public void insert(int data) {
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            insert(root, data);
        }
    }

    private void insert(final Node root, final int data) {
        if (root == null)
            return;
        if (data == root.data)
            return;

        Node newNode = new Node(data);
        if (newNode.data > root.data) {
            if (root.right == null)
                root.right = newNode;
            else
                insert(root.right, data);
        } else {
            if (root.left == null)
                root.left = newNode;
            else
                insert(root.left, data);
        }
    }

    public boolean contains(int data) {
        return contains(root, data);
    }

    private boolean contains(final Node root, final int data) {
        if (root == null)
            return false;

        if (root.data == data)
            return true;

        if (data > root.data)
            return contains(root.right, data);
        else
            return contains(root.left, data);
    }

    public int minValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.data;
    }

    public void deleteNode(int data) {
        root = deleteNode(root, data);
    }

    private Node deleteNode(Node root, int data) {
        if (root == null)
            return null;

        if (data < root.data) {
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            root.right = deleteNode(root.right, data);
        } else {
            if (root.left.isLeaf())
                return null;
            else if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                int minValue = minValue(root.right);
                root.data = minValue;
                root.right = deleteNode(root.right, minValue);
            }
        }
        return root;
    }
}
