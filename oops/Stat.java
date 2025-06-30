public class Stat {
    public static void main(String[] args) {
        Human h1 = new Human("Glen", 21, false);
        Human h2 = new Human("Jayson", 21, true);

        System.out.println(h1.name);
        System.out.println(h2.name);

        System.out.println(Human.population);
        System.out.println(Human.population);

        Stat obj = new Stat();
        obj.greetUser();

        greetUser2();
    }

    void greetUser() {
        System.out.println("Hello");
    }

    static void greetUser2() {
        System.out.println("Hello 2");
    }
}
