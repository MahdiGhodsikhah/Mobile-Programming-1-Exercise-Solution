class Student {
    String name;          // معمولی
    static String school = "Sadjad University"; // مشترک
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Ali";
        s2.name = "Sara";



        System.out.println(s1.name);
        System.out.println(s2.name);

        System.out.println(Student.school);
    }
}