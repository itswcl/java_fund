import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        // System.out.println( "String length is : " + length);

        String str1 = "My name is ";
        String str2 = "Wei";
        String str3 = str1.concat(str2);
        // System.out.println(str3);

        // %s expect a string, %.2f expect a (f)float (.2) 2 value after decimal point
        String ninja2 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        // System.out.println(ninja2);

        String ninja3 = "Welcome to Coding Dojo!";
        int a = ninja3.indexOf("Coding"); // 11
        int b = ninja3.indexOf("co"); // 3
        int c = ninja3.indexOf("pizza"); // -1 (no found)
        // System.out.println(a + b + c);

        String sentence = "      space everywhere!     ";
        // System.out.println(sentence.trim());

        String strA = "HELLO";
        String strB = "world";
        // System.out.println(strA.toLowerCase());
        // System.out.println(strB.toUpperCase());

        String testA = "same string";
        String testB = "same string";
        // System.out.println(testA == testB);

        testA = new String("same string");
        testB = new String("same string");
        // System.out.println(testA == testB); // different memory address
        // System.out.println(testA.equals(testB)); // same exact characters



        int[] numbers; // Variable declaration
        numbers = new int[5];
        numbers[0] = 11;
        numbers[3] = 33;

        System.out.println(numbers);// this only give us memory address

        // 1. import java util.Arrays;
        System.out.println(Arrays.toString(numbers));// this only give us memory address


        // Demo Pt2
        // import from another class
        // instantiate the class here to use it
        DemoPt2 x = new DemoPt2();
        // x is the entire DemoPt2 class
        x.sayHi();

        String myName = "John";
        System.out.println(x.sayHelloName(myName));

        String value = x.sayHelloName(myName);
        System.out.println(value + "!!!!!!!!!!!");

    }
}
