public class GreeterTest {
    public static void main(String[] args) {
        Greeter g = new Greeter();

        String greeting = g.greet();
        String greetingWName = g.greet("test");

        System.out.println(greetingWName);
    }
}
