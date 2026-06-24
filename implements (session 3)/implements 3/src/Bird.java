public class Bird implements FlyAble , Domestic{
    @Override
    public void fly() {
        System.out.println("I'm Bird");
    }
    @Override
    public String canFly() {
        return "I Can Fly";
    }

    @Override
    public String meat() {
        return "I Love Meat";
    }
}
