public class Main {

    public static void main(String[] args) {

        Car car = new Car();

        // مقدار اشتباه
        car.setSpeed(0);

        // مقدار درست
        car.setSpeed(50);

        car.showTime();
        car.showFuelUsage();
        car.showEnginePower();
    }
}