public class Greeter {
    public String greet(String name) {
        return createGreeting(name);
    }

    public String greet() {
        return createGreeting("World");
    }

    public String greet(String first, String last) {
        return createGreeting(first + " " + last);
    }

    private String createGreeting(String toBeGreeted) {
        return "Hello " + toBeGreeted + ", welcome";
    }
}
