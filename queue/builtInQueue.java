import java.util.LinkedList;
import java.util.Queue;

public class builtInQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(2);
        queue.add(7);
        queue.add(9);
        queue.add(3);
        queue.add(5);

        System.out.println(queue);

        System.out.println(queue.peek());

        System.out.println(queue.remove());

        System.out.println(queue);
    }
}