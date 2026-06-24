class Student {

    static int count = 0;

    Student() {
        count++;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();    // count = 1
        Student s2 = new Student();    // count = 2
        Student s3 = new Student();    // count = 3

        System.out.println(Student.count);
    }
}