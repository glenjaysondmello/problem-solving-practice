public class CustomQueue {
    public int[] data;
    final private static int DEFAULT_SIZE = 10;
    private int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        }

        data[end++] = item;
        return true;
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }

        int item = data[0];

        for(int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }

        end--;

        return item;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }

        return data[0];
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("");
        }

        System.out.print("[");

        for (int i = 0; i < end; i++) {
            System.out.print(data[i]);
            if (i < end)
                System.out.print(", ");
        }

        System.out.println("]");
    }

}
