class MathUtil {
    static int add(int a, int b) {
        return a + b;
    }
}

class Test {
    int age = 20;
    static void show(){
//        System.out.println(age);
        Test t = new Test();
        System.out.println(t.age);
    }
}

public class Main {
    public static void main(String[] args) {

        int result = MathUtil.add(10, 20);

        System.out.println(result);
    }
}