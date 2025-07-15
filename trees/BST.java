public class BST {

    public BST() {
    }

    public class Node {
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null)
            return -1;

        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        }

        if (value > node.value) {
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length - 1);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start > end)
            return;

        int mid = (start + end) / 2;

        insert(nums[mid]);

        populateSorted(nums, start, mid - 1);
        populateSorted(nums, mid + 1, end);
    }

    public void populate(int[] values) {
        for (int i = 0; i < values.length; i++) {
            insert(values[i]);
        }
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null)
            return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null)
            return;

        System.out.println(details + node.getValue());

        display(node.left, "Left child of" + node.getValue() + " : ");
        display(node.right, "Right child of" + node.getValue() + " : ");
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.value + " ");

        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null)
            return;

        postOrder(node.left);
        postOrder(node.right);

        System.out.print(node.value + " ");
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);

        System.out.print(node.value + " ");

        inOrder(node.right);
    }
}
