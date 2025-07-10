public class CircularQueue {
    public int[] data;
    final private static int DEFAULT_SIZE = 5;
    
    private int front = 0;
    private int end = 0;

    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        }

        data[end++] = item;
        end %= data.length;
        size++;
        return true;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }

        int item = data[front++];

        front %= data.length;
        size--;

        return item;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }

        return data[front];
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("");
        }

        System.out.print("[");

        int i = front;

        do {
            System.out.print(data[i] + ", ");
            i++;
            i %= data.length;
        } while (i != end);

        System.out.println("]");
    }

}
