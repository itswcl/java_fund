public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person(10, "P1");
        Person person2 = new Person(5, "P2");
        Person person3 = new Person(51, "P2");

        // access thru the class to check static method
        System.out.println(Person.peopleCount());
    }
}
