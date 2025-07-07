public class Main2 {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertFirst(15);

        list.insertLast(99);

        list.display();
        System.out.println();
        list.displayRev();
        System.out.println();
        list.displayFR();
    }
}
