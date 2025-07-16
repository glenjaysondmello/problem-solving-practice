public class AVL {

    private Node root;

    public AVL() {
    }

    private class Node {
        int value;
        int height;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.height = 0; // Start with height 0 (leaf)
        }

        int getValue() {
            return value;
        }
    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        return node == null ? -1 : node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        } else {
            // Duplicate value
            return node; // Skip insertion or handle duplicates
        }

        // Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Rebalance
        return rebalance(node);
    }

    private Node rebalance(Node node) {
        int balance = getBalance(node);

        // Left heavy
        if (balance > 1) {
            if (getBalance(node.left) >= 0) {
                return rightRotate(node); // Left-Left
            } else {
                node.left = leftRotate(node.left); // Left-Right
                return rightRotate(node);
            }
        }

        // Right heavy
        if (balance < -1) {
            if (getBalance(node.right) <= 0) {
                return leftRotate(node); // Right-Right
            } else {
                node.right = rightRotate(node.right); // Right-Left
                return leftRotate(node);
            }
        }

        return node; // Already balanced
    }

    private int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = 1 + Math.max(height(y.left), height(y.right));
        x.height = 1 + Math.max(height(x.left), height(x.right));

        return x; // New root
    }

    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));

        return y; // New root
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length - 1);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start > end) return;

        int mid = (start + end) / 2;
        insert(nums[mid]);

        populateSorted(nums, start, mid - 1);
        populateSorted(nums, mid + 1, end);
    }

    public void populate(int[] values) {
        for (int value : values) {
            insert(value);
        }
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) return true;

        int balance = getBalance(node);
        return Math.abs(balance) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) return;

        System.out.println(details + node.getValue());

        display(node.left, "Left child of " + node.getValue() + " : ");
        display(node.right, "Right child of " + node.getValue() + " : ");
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) return;

        System.out.print(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) return;

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }
}
