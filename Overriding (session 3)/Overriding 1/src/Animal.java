class Animal {
    public void sound() {
        System.out.println("Some generic animal sound");
    }

    public void move() {
        System.out.println("Animal moves");
    }
}

// کلاس فرزند 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void move() {
        System.out.println("Dog runs on 4 legs");
    }
}

// کلاس فرزند 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow! Meow!");
    }

    @Override
    public void move() {
        System.out.println("Cat walks silently");
    }
}

// کلاس فرزند 3
class Bird extends Animal {
    @Override
    public void sound() {
        System.out.println("Tweet tweet!");
    }

    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}
