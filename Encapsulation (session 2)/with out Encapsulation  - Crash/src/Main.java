public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        // کاربر سرعت غیرمجاز وارد می‌کند
        car.speed = 0;

        car.showSpeed();
    }
}