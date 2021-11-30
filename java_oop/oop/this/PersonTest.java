public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(10, "One");
        Person person2 = new Person(5, "Two");

        person1.objectMethods(person2);
    }
}
