public class DemoClass implements FirstInterface, SecondInterface{
    @Override
    public void myMethod() {
        System.out.println("Some text..");
    }

    @Override
    public void myotherMethod() {
        System.out.println("Some other text...");
    }
}
