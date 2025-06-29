public class intro {
    public static void main(String[] args) {
        Student stud = new Student();

        // stud.rno = 1;
        // stud.name = "glen";
        // stud.marks = 90.0f;

        System.out.println(stud.rno);
        System.out.println(stud.name);
        System.out.println(stud.marks);

        Student stud1 = new Student(2, "jayson", 88.9f);

        System.out.println(stud1.name);

        // S s;

        // for (int i = 0; i < 1000000000; i++) {
        //     s = new S("s");
        // }
    }
}

class Student {
    int rno;
    String name;
    float marks;

    Student() {
        // this.rno = 1;
        // this.name = "A";
        // this.marks = 50;

        this(1, "default", 50.0f);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}

class S {
    final int num = 48;
    String name;

    S(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}