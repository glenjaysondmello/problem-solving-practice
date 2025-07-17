public class SegmentTree {
    public SegmentTree() {
    }

    private class Node {
        int data;
        Node left;
        Node right;
        int startInterval;
        int endInterval;

        public Node(int data) {
            this.data = data;
        }

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    public SegmentTree(int[] arr) {
        root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);

        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display() {
        display(root);
    }

    private void display(Node node) {
        String str = "";

        if (node.left != null) {
            str += "Interval = [" + node.left.startInterval + "-" + node.left.endInterval + "] and data "
                    + node.left.data + " => ";
        } else {
            str += "No left child";
        }

        str += "Interval = [" + node.startInterval + "-" + node.endInterval + "] and data " + node.data + " <= ";

        if (node.right != null) {
            str += "Interval = [" + node.right.startInterval + "-" + node.right.endInterval + "] and data "
                    + node.right.data;
        } else {
            str += "No left child";
        }

        System.out.println(str + "\n");

        if (node.left != null) {
            display(node.left);
        }

        if (node.right != null) {
            display(node.right);
        }
    }

    public int query(int qsi, int qei) {
        return query(root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        } else if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        } else {
            return query(node.left, qsi, qei) + query(node.right, qsi, qei);
        }
    }

    public void update(int index, int value) {
        root.data = update(root, index, value);
    }

    private int update(Node node, int index, int value) {
        if(index >= node.startInterval && index <= node.endInterval) {
            if(index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            } else {
                int leftVal = update(node.left, index, value);
                int rightVal = update(node.right, index, value);

                node.data = leftVal + rightVal;

                return node.data;
            }
        }

        return node.data;
    }
}
