class Car {

    private int speed;
    // Setter
    public void setSpeed(int speed) {

        // جلوگیری از مقدار خطرناک
        if (speed <= 0) {
            System.out.println("Speed must be greater than zero!");
        } else {
            this.speed = speed;
        }
    }
    // Getter
    public int getSpeed() {
        return speed;
    }

    public void showSpeed() {

        int time = 100 / speed;

        System.out.println("Time: " + time);
    }
}