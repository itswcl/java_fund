public class Person {
    private int age;
    private String name;
    private static int numberOfPeople = 0;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
        numberOfPeople++;
    }


    // static method only able to call static method
    // static method only belows to the "Class"
    // no access for instance
    public static int peopleCount() {
        return numberOfPeople;
    }
}
