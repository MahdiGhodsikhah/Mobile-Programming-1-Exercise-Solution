abstract class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
    abstract void move();
}
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("Car moves on roads");
    }
}
class Airplane extends Vehicle {
    @Override
    void move() {
        System.out.println("Airplane flies in sky");
    }
}
public class Main {
    public static void main(String[] args) {

//        Vehicle a = new Vehicle(); // خطا
        Vehicle car = new Car();
        Vehicle airplane = new Airplane();

        car.start();
        car.move();

        airplane.start();
        airplane.move();
    }
}