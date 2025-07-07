public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertFirst(15);

        list.insertLast(99);

        list.insert(6, 3);

        System.out.println(list.getNodeByIndex(1));
        System.out.println(list.findNodeByValue(7));

        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.deleteIndex(2));
        list.display();
    }
}
