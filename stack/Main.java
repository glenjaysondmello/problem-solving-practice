public class Main {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();

        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(2);

        System.out.println(stack.pop());

        stack.printStack();

        System.out.println("----------------------------------------------");

        DymanicStack dstack = new DymanicStack();

        dstack.push(3);
        dstack.push(3);
        dstack.push(3);
        dstack.push(3);
        dstack.push(3);
        dstack.push(3);
        dstack.push(3);
        dstack.push(3);
        dstack.push(3);
        dstack.push(2);
        dstack.push(2);
        dstack.push(2);
        dstack.push(2);
        dstack.push(2);
        dstack.push(2);
        dstack.push(4);

        dstack.printStack();

        System.out.println(dstack.pop());

        dstack.printStack();

        System.out.println("----------------------------------------------");

        CustomStack cstack = new DymanicStack();

        cstack.push(2);
        cstack.push(4);
        cstack.push(2);
        cstack.push(4);
        cstack.push(2);
        cstack.push(4);
        cstack.push(2);
        cstack.push(4);
        cstack.push(2);
        cstack.push(4);
        cstack.push(2);
        cstack.push(4);
        cstack.push(2);
        cstack.push(4);
        cstack.push(2);
        cstack.push(4);
        cstack.push(2);
        cstack.push(4);
        cstack.push(2);
        cstack.push(4);

        cstack.printStack();
    }
}
