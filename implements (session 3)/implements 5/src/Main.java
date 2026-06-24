public class Main {
    public static void main(String[] args) {
        // همه می‌تونن شنا کنن چون قرارداد رو امضا کردن

        Swimmable fish = new Fish();
        Swimmable duck = new Duck();
        Swimmable human = new Human();

        fish.swim();   // خروجی:  Fish is swimming in water
        duck.swim();   // خروجی:  Duck is swimming on the lake
        human.swim();  // خروجی:  Human is swimming with style
    }
}