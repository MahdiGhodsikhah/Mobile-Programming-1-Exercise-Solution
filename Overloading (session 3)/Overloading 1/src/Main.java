public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.sum(5, 10));        // خروجی: 15

        System.out.println(calc.sum(5, 10, 15));  // خروجی: 30

        System.out.println(calc.sum(5.5, 2.3));    // خروجی: 7.8

        System.out.println(calc.sum(5, 2.5));      // خروجی: 7.5
    }
}