class Car {

    public int speed;

    public void showTime() {
        int time = 100 / speed;
        System.out.println("Time: " + time);
    }

    public void showFuelUsage() {
        int fuel = 500 / speed;
        System.out.println("Fuel: " + fuel);
    }

    public void showEnginePower() {
        int power = 1000 / speed;
        System.out.println("Power: " + power);
    }
}