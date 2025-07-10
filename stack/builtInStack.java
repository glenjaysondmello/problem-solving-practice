import java.util.Stack;

public class builtInStack {
    public static void main(String[] args) {
        Stack<Integer> stack =  new Stack<>();

        stack.push(2);
        stack.push(5);
        stack.push(2);
        stack.push(9);
        System.out.println(stack.push(1));

        System.out.println(stack);

        stack.pop();

        System.out.println(stack);

        System.out.println(stack.peek());
    }
}