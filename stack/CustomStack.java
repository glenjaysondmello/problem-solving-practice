public class CustomStack {
    public int[] data;
    final private static int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack () {
        this(DEFAULT_SIZE);
    }

    public CustomStack (int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if(isFull()) {
            System.out.println("Stack is Full");
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int pop() throws StackException{
        if(isEmpty()) {
            throw new StackException("Stack is Empty");
        }

        // int item = data[ptr];
        // ptr--;
        // return item;

        return data[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty()) {
            throw new StackException("Stack is Empty");
        }

        return data[ptr];
    }

    public void printStack() {
        if(isEmpty()) {
            System.out.println("");
        }

        System.out.print("[");

        for(int i = 0; i <= ptr; i++) {
            System.out.print(data[i]);
            if(i < ptr) System.out.print(", ");
        }

        System.out.println("]");
    }

    
}
