public class Main {
    public static void main(String[] args) throws Exception{
        CustomQueue queue = new CustomQueue();

        queue.insert(3);
        queue.insert(2);
        queue.insert(2);
        queue.insert(2);
        queue.insert(2);
        queue.insert(2);

        queue.printQueue();

        queue.remove();

        queue.printQueue();

        System.out.println(queue.front());

        queue.printQueue();


        System.out.println("---------------------------------------");

        CircularQueue cqueue = new CircularQueue();

        cqueue.insert(4);
        cqueue.insert(3);
        cqueue.insert(3);
        cqueue.insert(3);
        cqueue.insert(2);

        cqueue.printQueue();

        cqueue.remove();

        cqueue.printQueue();

        cqueue.insert(5);
        cqueue.insert(7);

        cqueue.printQueue();

        System.out.println("------------------------------------------");

        DynamicCQueue cdq = new DynamicCQueue();

        cdq.insert(4);
        cdq.insert(3);
        cdq.insert(3);
        cdq.insert(3);
        cdq.insert(2);

        cdq.printQueue();

        cdq.remove();

        cdq.printQueue();

        cdq.insert(5);
        cdq.insert(7);

        cdq.printQueue();
    }
}
