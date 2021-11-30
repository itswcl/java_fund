public class Person {
    private int age;
    private String name;

    // public Person() {
    //     this(20, "John");
    // }

    public Person(int age, String name) {
        // both same
        // age = ageParam;
        // name = nameParam;
        this.age = age;
        this.name = name;
    }

    public void objectMethods(Person anotherObject) {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("toString: " + this.toString());
        System.out.println("Equals: " + this.equals(anotherObject));
    }
}