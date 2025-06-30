public class Human {
    String name;
    int age;
    boolean isEmployeed;
    static int population;

    Human(String name, int age, boolean isEmployeed) {
        this.name = name;
        this.age = age;
        this.isEmployeed = isEmployeed;
        Human.population += 1;
    }
}
