public class Main {
    public static void main(String[] args) {

        Animal myAnimal1 = new Dog();
        Animal myAnimal2 = new Cat();
        Animal myAnimal3 = new Bird();

        myAnimal1.sound();  // خروجی: Woof! Woof!
        myAnimal2.sound();  // خروجی: Meow! Meow!
        myAnimal3.sound();  // خروجی: Tweet tweet!

        myAnimal1.move();   // خروجی: Dog runs on 4 legs
        myAnimal2.move();   // خروجی: Cat walks silently
        myAnimal3.move();   // خروجی: Bird flies

    }
}