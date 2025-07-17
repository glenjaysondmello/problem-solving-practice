import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        BST bstree = new BST();

        // tree.populate(sc);
        // // tree.display();
        // tree.prettyDisplay();

        int[] nums = {3, 5, 2, 7, 8, 9};
        int[] numSorts = {1, 2, 3, 4, 5};

        // bstree.populate(nums);
        bstree.populateSorted(numSorts);

        // bstree.display();

        AVL avl = new AVL();

        // for(int i = 0; i < 1000; i++) {
        //     avl.insert(i);
        // }

        // System.out.println(avl.height());

        SegmentTree sgtree = new SegmentTree(nums);

        // sgtree.display();

        System.out.println(sgtree.query(1, 4));

        sgtree.update(2, 4);

        System.out.println(sgtree.query(1, 4));
    }
}
