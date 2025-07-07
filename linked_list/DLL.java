public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        Node last = head;

        node.next = null;

        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null) {
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public Node findNodeByValue(int value) {
        Node node = head;

        while(node != null) {
            if(node.value == value) {
                return node;
            }

            node = node.next;
        }

        return null;
    }

    public void insert(int after, int value) {
        Node a = findNodeByValue(after);

        if(a == null) {
            System.out.println("Node does not exist");
            return;
        }

        Node node = new Node(value);

        node.prev = a;
        node.next = a.next;
        a.next = node;
        
        if(node.next != null) {
            node.next.prev = node;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }

    public void displayRev() {
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.prev;
        }

        System.out.println("END");
    }

    public void displayFR() {
        Node temp = head;
        Node last = null;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }

        System.out.println("END");

        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }

        System.out.println("START");

    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}