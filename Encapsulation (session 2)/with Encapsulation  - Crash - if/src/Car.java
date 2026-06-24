class Car {

    private int speed;

    public void setSpeed(int speed){

        if(speed > 0){
            this.speed = speed;
        } else {
            System.out.println("Invalid speed");
        }
    }

    public void showTime() {
        int time = 100 / speed;
        System.out.println(time);
    }

    public void showFuelUsage() {
        int fuel = 500 / speed;
        System.out.println(fuel);
    }

    public void showEnginePower() {
        int power = 1000 / speed;
        System.out.println(power);
    }
}