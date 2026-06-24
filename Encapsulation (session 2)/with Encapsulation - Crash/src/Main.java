public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        // مقدار اشتباه
        car.setSpeed(0);

        // مقدار صحیح
        car.setSpeed(50);

        car.showSpeed();
    }
}