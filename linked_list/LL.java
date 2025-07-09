public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertRec(int index, int value) {
        head = insertRec(index, value, head);
    }

    private Node insertRec(int index, int value, Node node) {
        if(index == 0) {
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRec(--index, value, node.next);
        return node;
    }

    public void insertLast(int value) {
        if(tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size++;
    }

    public void insert(int value, int index) {
        if(index == 0) {
            insertFirst(value);
            return;
        }

        if(index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;

        for(int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        int value = head.value;
        head = head.next;

        if(head == null) {
            tail = null;
        }

        size--;
        return value;
    }

    public int deleteLast() {
        if(size <= 1) return deleteFirst();

        int value = tail.value;

        Node prevOfTail = getNodeByIndex(size - 2);
        tail = prevOfTail;
        tail.next = null;
        size--;

        return value;
    }

    public int deleteIndex(int index) {
        if(index == 0) return deleteFirst();
        if(index == size - 1) return deleteLast();

        Node prevOfIndex = getNodeByIndex(index - 1);
        int value = prevOfIndex.next.value;
        prevOfIndex.next = prevOfIndex.next.next;

        return value;

        // Node prev = getNodeByIndex(index - 1);
        // Node cur = getNodeByIndex(index);
        
        // int value = cur.value;
        // prev.next = cur.next;

        // return value;
    }

    public Node getNodeByIndex(int index) {
        Node node = head;

        for(int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
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

    public void reverseList() {
        reverseList(head);
    }

    private void reverseList(Node node) {
        if(node == tail) {
            head = tail;
            return;
        }

        reverseList(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    public void display() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }

        System.out.println("END");
    }
    
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}