public class Main {
    public static void main(String[] args) {
        int age = 20;
        int her_age = age;
        her_age = 21;

        System.out.println("age = " + age);
        System.out.println("her_age = " + her_age);

        int[] numbers = new int[3];

        int[] x = {1, 2, 3};
        int[] y = x;
        y[0] = 99;

        System.out.println("x[0] = " + x[0]);
        System.out.println("y[0] = " + y[0]);
    }
}
