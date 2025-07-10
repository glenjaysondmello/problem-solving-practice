import java.util.ArrayDeque;
import java.util.Deque;

public class builtInDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(2);
        deque.addFirst(7);
        deque.add(9);
        deque.addLast(3);
        deque.add(5);

        System.out.println(deque);

        System.out.println(deque.peek());

        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

        System.out.println(deque);
    }
}